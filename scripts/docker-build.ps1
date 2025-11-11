Param(
    [string]$ImageName = "recoveredapp-build",
    [switch]$Build,
    [switch]$Shell,
    [switch]$AssembleDebug,
    [switch]$AssembleRelease
)

$projectRoot = Split-Path -Parent $MyInvocation.MyCommand.Path | Split-Path -Parent
if ($Build) {
    docker build -t $ImageName $projectRoot
}

function Invoke-GradleInContainer([string]$GradleArgs) {
    docker run --rm -v ${projectRoot}:/workspace -w /workspace $ImageName bash -lc "chmod +x gradlew; ./gradlew $GradleArgs"
}

if ($Shell) {
    docker run --rm -it -v ${projectRoot}:/workspace -w /workspace $ImageName /bin/bash
}
elseif ($AssembleDebug) {
    Invoke-GradleInContainer "clean assembleDebug"
}
elseif ($AssembleRelease) {
    Invoke-GradleInContainer "clean assembleRelease"
}
else {
    Write-Host "用法示例:" -ForegroundColor Cyan
    Write-Host "  # 构建镜像"; Write-Host "  ./scripts/docker-build.ps1 -Build"
    Write-Host "  # 进入容器交互"; Write-Host "  ./scripts/docker-build.ps1 -Shell"
    Write-Host "  # 构建 Debug APK"; Write-Host "  ./scripts/docker-build.ps1 -AssembleDebug"
    Write-Host "  # 构建 Release APK"; Write-Host "  ./scripts/docker-build.ps1 -AssembleRelease"
}
