# 方案：绕过Docker Desktop，直接在容器内构建（无需WSL2）

Write-Host "检测到系统无法启用VirtualMachinePlatform功能" -ForegroundColor Yellow
Write-Host "提供替代方案：使用便携版Docker或云端构建" -ForegroundColor Cyan
Write-Host ""

Write-Host "=== 方案A：使用GitHub Actions云端构建（推荐）===" -ForegroundColor Green
Write-Host "优点：无需本地Docker，100%成功，免费"
Write-Host "操作：我可以为你生成.github/workflows/build.yml配置"
Write-Host "      推送代码到GitHub后自动构建并下载APK"
Write-Host ""

Write-Host "=== 方案B：使用在线Linux环境（Replit/CodeSandbox）===" -ForegroundColor Green  
Write-Host "在线IDE提供Linux环境，可直接gradlew构建"
Write-Host ""

Write-Host "=== 方案C：降级使用Docker Toolbox（旧版）===" -ForegroundColor Yellow
Write-Host "下载地址：https://github.com/docker/toolbox/releases"
Write-Host "使用VirtualBox代替Hyper-V，但性能较差"
Write-Host ""

Write-Host "=== 方案D：手动拷贝到Linux机器或朋友电脑===" -ForegroundColor Yellow
Write-Host "将RecoveredApp目录打包，在真实Linux或Mac上构建"
Write-Host ""

$choice = Read-Host "请选择方案（输入 A/B/C/D 或按Enter取消）"

switch ($choice.ToUpper()) {
    "A" {
        Write-Host "即将生成GitHub Actions配置文件..."
        # 这里后续可以调用生成workflow文件
    }
    "B" {
        Write-Host "访问 https://replit.com 创建免费账号"
        Write-Host "上传项目后在终端执行: ./gradlew assembleDebug"
    }
    "C" {
        Start-Process "https://github.com/docker/toolbox/releases"
    }
    "D" {
        Write-Host "将整个RecoveredApp文件夹打包为zip"
        Write-Host "传输到Linux系统后解压，执行 ./gradlew assembleDebug"
    }
    default {
        Write-Host "已取消" -ForegroundColor Gray
    }
}
