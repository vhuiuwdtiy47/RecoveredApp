<#!
WSL (Ubuntu) 环境下构建 Android 项目辅助脚本。
用途: 避免 Windows 上 :app:mergeDebugResources Illegal char <:> 冒号路径异常。

步骤概览:
 1. 确认已安装并启用 WSL 和 Ubuntu 发行版。
 2. 在 Windows PowerShell 里运行本脚本，它会把当前项目复制到 WSL 家目录并执行构建。
 3. 构建输出 APK 位于 WSL ~/RecoveredApp/app/build/outputs/apk/debug/ 下，对应 Windows 路径: \\wsl$\Ubuntu\home\<user>\RecoveredApp\app\build\outputs\apk\debug\。

参数:
  -DistroName  指定 WSL 发行版名称 (默认 Ubuntu)
  -ProjectDir  指定要复制的项目目录 (默认 当前脚本父目录的上一层 RecoveredApp)
  -GradleTask  要执行的 Gradle 任务 (默认 assembleDebug)

兼容性:
  需要 Ubuntu 下安装 openjdk-17 + unzip + bash。首次运行会自动安装。
!>
param(
  [string]$DistroName = 'Ubuntu',
  [string]$GradleTask = 'assembleDebug',
  [string]$ProjectDir = (Resolve-Path (Join-Path $PSScriptRoot '..'))
)

function Assert-WSLInstalled {
  if (-not (Get-Command wsl.exe -ErrorAction SilentlyContinue)) {
    Write-Error '未找到 wsl.exe，请在“启用或关闭 Windows 功能”中启用“适用于 Linux 的 Windows 子系统”并安装 Ubuntu。'
    exit 1
  }
}

function Get-UbuntuUser {
  $user = wsl -d $DistroName bash -c 'echo $USER' 2>$null
  if (-not $user) { Write-Error "无法获取 WSL 用户，请确保已初始化 $DistroName"; exit 1 }
  return $user.Trim()
}

function Sync-ProjectToWSL {
  param([string]$UbuntuUser, [string]$Target='/home')
  $dest = "\\wsl$\$DistroName\home\$UbuntuUser\RecoveredApp"
  if (Test-Path $dest) { Write-Host '删除旧的 WSL 项目副本...' -ForegroundColor Yellow; Remove-Item -Recurse -Force $dest }
  Write-Host "复制项目到 $dest ..." -ForegroundColor Cyan
  Copy-Item -Recurse -Force $ProjectDir $dest
}

function Ensure-UbuntuDeps {
  Write-Host '检查并安装 Ubuntu 依赖 (openjdk-17-jdk unzip)...' -ForegroundColor Cyan
  wsl -d $DistroName bash -c 'sudo apt-get update -y && sudo apt-get install -y openjdk-17-jdk unzip' | Out-Null
}

function Run-GradleBuild {
  param([string]$UbuntuUser)
  Write-Host '执行 Gradle 构建 (首次会下载 Gradle 分发)...' -ForegroundColor Green
  $cmd = "cd /home/$UbuntuUser/RecoveredApp && ./gradlew $GradleTask"
  wsl -d $DistroName bash -c $cmd
}

Assert-WSLInstalled
$ubuntuUser = Get-UbuntuUser
Sync-ProjectToWSL -UbuntuUser $ubuntuUser
Ensure-UbuntuDeps
Run-GradleBuild -UbuntuUser $ubuntuUser

Write-Host '构建完成（若成功）请检查 APK:' -ForegroundColor Green
Write-Host "\\wsl$\$DistroName\home\$ubuntuUser\RecoveredApp\app\build\outputs\apk\debug" -ForegroundColor Cyan
Write-Host '如果仍失败，把 WSL 输出的最后 50 行错误贴回来。' -ForegroundColor Yellow