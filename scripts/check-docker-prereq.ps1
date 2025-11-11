<#!
.SYNOPSIS
  检查当前 Windows 10 是否满足安装 Docker Desktop 的前置条件。
.DESCRIPTION
  输出: OS版本, 虚拟化状态, WSL 功能, VirtualMachinePlatform, Containers 功能, 是否已安装 WSL2 内核。
#>
Write-Host "[1] 操作系统版本" -ForegroundColor Cyan
Get-ComputerInfo | Select-Object OsName, OsVersion, WindowsVersion, OsBuildNumber | Format-List

Write-Host "[2] 虚拟化支持 (CPU + Hyper-V)" -ForegroundColor Cyan
$virt = (Get-CimInstance -ClassName Win32_ComputerSystem).HypervisorPresent
if ($virt) { Write-Host "HypervisorPresent: True (BIOS 已开启虚拟化)" -ForegroundColor Green } else { Write-Host "HypervisorPresent: False (需要在 BIOS 开启 VT-x/AMD-V)" -ForegroundColor Yellow }

Write-Host "[3] WSL / VirtualMachinePlatform / Containers 功能" -ForegroundColor Cyan
$features = @("Microsoft-Windows-Subsystem-Linux","VirtualMachinePlatform","Containers")
foreach ($f in $features) {
  $state = (Get-WindowsOptionalFeature -Online -FeatureName $f).State
  Write-Host ("{0,-35} : {1}" -f $f,$state) -ForegroundColor (if ($state -eq "Enabled") {"Green"} else {"Yellow"})
}

Write-Host "[4] WSL2 默认版本" -ForegroundColor Cyan
try { wsl -l -v | Out-Host } catch { Write-Host "WSL 未安装或版本较低" -ForegroundColor Yellow }

Write-Host "[5] 检查 Linux 内核包" -ForegroundColor Cyan
$kernelPath = "$env:windir\system32\lxss"
if (Test-Path $kernelPath) { Write-Host "WSL 目录存在: $kernelPath" -ForegroundColor Green } else { Write-Host "未发现 WSL 目录 (将通过 enable-wsl.ps1 安装)" -ForegroundColor Yellow }

Write-Host ""
Write-Host "===> Assessment:" -ForegroundColor Magenta
if ($virt -and (Get-WindowsOptionalFeature -Online -FeatureName Microsoft-Windows-Subsystem-Linux).State -eq "Enabled" -and (Get-WindowsOptionalFeature -Online -FeatureName VirtualMachinePlatform).State -eq "Enabled") {
  Write-Host "All prerequisites met for Docker Desktop" -ForegroundColor Green
} else {
  Write-Host "Not all requirements met - will auto-enable now" -ForegroundColor Yellow
}
