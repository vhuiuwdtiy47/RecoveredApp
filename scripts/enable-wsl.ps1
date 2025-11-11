<#!
.SYNOPSIS
  启用 WSL / VirtualMachinePlatform / Containers 并设置 WSL2 为默认版本，随后提示 Docker Desktop 安装。
#>
param(
  [switch]$SkipRestart
)

Write-Host "启用 Windows 可选功能: WSL / VirtualMachinePlatform / Containers" -ForegroundColor Cyan
$features = @("Microsoft-Windows-Subsystem-Linux","VirtualMachinePlatform","Containers")
foreach ($f in $features) {
  $current = (Get-WindowsOptionalFeature -Online -FeatureName $f).State
  if ($current -ne "Enabled") {
    Enable-WindowsOptionalFeature -Online -FeatureName $f -All -NoRestart | Out-Null
    Write-Host "$f 已启用 (等待重启生效)" -ForegroundColor Green
  } else {
    Write-Host "$f 已启用 (跳过)" -ForegroundColor DarkGreen
  }
}

Write-Host "设置 WSL2 作为默认版本" -ForegroundColor Cyan
try { wsl --set-default-version 2; Write-Host "WSL 默认版本设置为 2" -ForegroundColor Green } catch { Write-Host "设置失败: $_" -ForegroundColor Yellow }

Write-Host "如果首次安装 WSL 内核，可下载最新内核更新包: https://aka.ms/wsl2kernel" -ForegroundColor Cyan

if (-not $SkipRestart) {
  Write-Host "请保存工作后重启系统，然后运行: scripts/check-docker-prereq.ps1" -ForegroundColor Magenta
} else {
  Write-Host "已跳过重启，请手动重启以使更改生效" -ForegroundColor Yellow
}

Write-Host "重启后 -> 下载 Docker Desktop: https://desktop.docker.com/win/main/amd64/Docker%20Desktop%20Installer.exe" -ForegroundColor Cyan
Write-Host "安装时勾选: [ Use WSL 2 instead of Hyper-V ]" -ForegroundColor Cyan
