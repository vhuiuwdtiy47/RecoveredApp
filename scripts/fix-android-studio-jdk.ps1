# Android Studio JDK 设置自动化脚本

Write-Host "正在配置 Android Studio 使用 JDK 17..." -ForegroundColor Green

# 1. 设置环境变量
$env:JAVA_HOME = "C:\xinwenjianjia\jdk-17"
$env:JDK_HOME = "C:\xinwenjianjia\jdk-17"

# 2. 更新系统环境变量（永久）
[Environment]::SetEnvironmentVariable("JAVA_HOME", "C:\xinwenjianjia\jdk-17", "User")
[Environment]::SetEnvironmentVariable("JDK_HOME", "C:\xinwenjianjia\jdk-17", "User")

# 3. 清理 Gradle 缓存
Write-Host "清理 Gradle 缓存..." -ForegroundColor Yellow
if (Test-Path "$env:USERPROFILE\.gradle") {
    Remove-Item -Recurse -Force "$env:USERPROFILE\.gradle\caches" -ErrorAction SilentlyContinue
    Write-Host "  已清理用户 Gradle 缓存"
}

if (Test-Path ".gradle") {
    Remove-Item -Recurse -Force ".gradle" -ErrorAction SilentlyContinue
    Write-Host "  已清理项目 Gradle 缓存"
}

if (Test-Path "app\build") {
    Remove-Item -Recurse -Force "app\build" -ErrorAction SilentlyContinue
    Write-Host "  已清理 app/build"
}

if (Test-Path "build") {
    Remove-Item -Recurse -Force "build" -ErrorAction SilentlyContinue
    Write-Host "  已清理 build"
}

# 4. 验证 JDK
Write-Host "`n验证 JDK 配置:" -ForegroundColor Green
Write-Host "JAVA_HOME = $env:JAVA_HOME"
& "$env:JAVA_HOME\bin\java.exe" -version

Write-Host "`n=== 完成! ===" -ForegroundColor Green
Write-Host "现在请按以下步骤操作:" -ForegroundColor Cyan
Write-Host "1. 关闭 Android Studio（如果已打开）"
Write-Host "2. 重新打开 Android Studio"
Write-Host "3. 打开项目: $PWD"
Write-Host "4. 在 Android Studio 中:"
Write-Host "   File → Settings → Build, Execution, Deployment → Build Tools → Gradle"
Write-Host "   Gradle JDK: 选择 'C:\xinwenjianjia\jdk-17'"
Write-Host "5. 点击 Apply → OK"
Write-Host "6. 点击 File → Sync Project with Gradle Files"
Write-Host "`n注意: 即使同步成功，Windows 本地构建仍会失败（aapt2 bug）。" -ForegroundColor Yellow
Write-Host "请使用 GitHub Actions 获取 APK。" -ForegroundColor Yellow
