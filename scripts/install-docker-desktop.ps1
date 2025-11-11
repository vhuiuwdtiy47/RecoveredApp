# Docker Desktop 自动安装脚本 (Windows 10)
$dockerUrl = "https://desktop.docker.com/win/main/amd64/Docker%20Desktop%20Installer.exe"
$installerPath = "$env:TEMP\DockerDesktopInstaller.exe"

Write-Host "正在下载 Docker Desktop 安装包..." -ForegroundColor Cyan
try {
    Invoke-WebRequest -Uri $dockerUrl -OutFile $installerPath -UseBasicParsing
    Write-Host "下载完成: $installerPath" -ForegroundColor Green
    
    Write-Host "启动安装程序..." -ForegroundColor Cyan
    Write-Host "安装过程中请选择: Use WSL 2 instead of Hyper-V (如有选项)" -ForegroundColor Yellow
    
    Start-Process -FilePath $installerPath -Wait
    
    Write-Host "Docker Desktop 安装完成!" -ForegroundColor Green
    Write-Host "请启动 Docker Desktop 并等待引擎启动完成" -ForegroundColor Cyan
    Write-Host "然后运行: docker version" -ForegroundColor Cyan
} catch {
    Write-Host "下载失败: $_" -ForegroundColor Red
    Write-Host "请手动下载: $dockerUrl" -ForegroundColor Yellow
}
