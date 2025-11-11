# 使用 GitHub Actions 云端构建 Android APK

由于本地 Windows 系统无法启用 Docker 所需的虚拟化功能，我们采用 **GitHub Actions 云端构建**方案。

## 优势
✅ 完全免费（每月2000分钟构建时间）  
✅ 在真实 Linux 环境构建，100% 绕过 Windows 路径问题  
✅ 自动化：每次推送代码自动构建  
✅ 无需本地安装任何工具  

## 使用步骤

### 1. 初始化 Git 仓库（如果还没有）
```powershell
cd C:\Users\Administrator\Desktop\18.81\RecoveredApp
git init
git add .
git commit -m "Initial commit with GitHub Actions build"
```

### 2. 创建 GitHub 仓库并推送
访问 https://github.com/new 创建新仓库（设为 Private 私有）

然后执行：
```powershell
git remote add origin https://github.com/你的用户名/你的仓库名.git
git branch -M main
git push -u origin main
```

### 3. 查看构建进度
推送后，访问：
https://github.com/你的用户名/你的仓库名/actions

构建过程约需 3-5 分钟。

### 4. 下载生成的 APK
构建成功后，在 Actions 页面点击最新的工作流运行记录，在 Artifacts 区域下载：
- `app-debug.zip`（包含 app-debug.apk）
- `app-release.zip`（如果签名配置正确）

## 触发构建的方式
- 每次推送代码到 main/master 分支
- 在 GitHub Actions 页面手动点击 "Run workflow"

## 本地修改后重新构建
```powershell
git add .
git commit -m "更新代码"
git push
```
推送后自动触发构建。

## 故障排查
如果构建失败：
1. 查看 Actions 页面的构建日志
2. 常见问题：
   - gradlew 权限：已在 workflow 中自动 chmod +x
   - 依赖下载：GitHub 服务器网络通畅，无需担心
   - 资源路径：Linux 环境无冒号路径问题

## 无 GitHub 账号的替代方案
如果不想用 GitHub，可以：
- **GitLab CI**：类似配置，也提供免费 CI/CD
- **Replit**：在线 IDE，直接上传项目执行 `./gradlew assembleDebug`
- **找有 Linux/Mac 的朋友**：拷贝整个项目文件夹，执行构建

---

需要我帮你继续操作 Git 推送吗？或者生成其他平台的配置？
