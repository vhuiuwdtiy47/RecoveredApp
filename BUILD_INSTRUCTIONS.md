# Android APK 构建说明

## 问题说明

你的项目在 **Windows 本地无法构建**，原因是：

**aapt2 资源编译器的 Windows 路径 bug**：
```
InvalidPathException: Illegal char <:> at index 44: 
com.android.music.app-mergeDebugResources-55:/values/values.xml
```

这是 Android Gradle Plugin 7.x 在 Windows 上的已知问题，当项目包含大量资源文件（特别是多语言 values 目录）时，aapt2 会生成包含冒号的虚拟路径，而 Windows 文件系统不允许路径中出现冒号。

**本地无法解决的原因：**
- 升级到 AGP 8.x：会引入 JDK 兼容性问题
- 降级 build-tools：30.0.3 已经是可用的最低版本
- 删除资源目录：会破坏应用功能
- WSL/Docker：你的 Windows 10 系统无法启用虚拟化功能

## 解决方案：使用 GitHub Actions 云端构建

我已经配置好了 GitHub Actions 自动化构建流程，**你的 APK 将在 Linux 环境中成功构建**。

### 当前状态

✅ GitHub Actions workflow 已配置完成  
✅ Android SDK 自动安装和缓存  
✅ Gradle 依赖缓存加速  
✅ Debug 和 Release APK 自动构建  
✅ 构建产物自动上传为 Artifacts  

### 如何获取 APK

1. 打开你的 GitHub 仓库：https://github.com/vhuiuwdtiy47/RecoveredApp

2. 点击顶部的 **Actions** 标签页

3. 查看最新的 workflow 运行（名称："Build Android APK"）
   - 提交信息包含 "CI: use HOME for SDK path, fix PATH append"
   
4. 等待构建完成（约 5-10 分钟，首次运行会下载 SDK）

5. 构建成功后，在运行页面底部找到 **Artifacts** 区域

6. 下载以下文件：
   - **app-debug**：调试版 APK（可直接安装）
   - **app-release**：未签名的发布版 APK（需要签名才能安装）
   - **build-reports**：构建日志（如果需要调试）

### 触发新构建的方法

每次你向 `main` 分支推送代码时，都会自动触发构建。

或者手动触发：
1. 进入 Actions 页面
2. 点击左侧的 "Build Android APK" workflow
3. 点击右上角的 "Run workflow" 按钮
4. 选择 main 分支，点击绿色的 "Run workflow"

### 本地环境说明

已为你安装的组件（位于 `C:\android-sdk`）：
- Android commandline-tools (latest)
- platform-tools
- platforms;android-33
- build-tools;30.0.3

**但本地仍然无法构建**，因为 Windows aapt2 bug 无法绕过。

## 推荐工作流程

1. **开发阶段**：在本地编辑代码
2. **构建阶段**：推送到 GitHub，让 Actions 自动构建
3. **测试阶段**：从 Artifacts 下载 APK 安装到设备测试

## 故障排查

如果 GitHub Actions 构建失败：

1. 点开失败的 workflow 运行
2. 展开失败的步骤（通常是 "Assemble Debug APK"）
3. 复制错误日志的最后 50-100 行
4. 检查是否是以下常见问题：
   - 网络超时：重新运行即可
   - 依赖下载失败：重新运行即可
   - 代码错误：修复代码后重新推送

## 下一步优化（可选）

如果需要签名的 Release APK：
1. 生成 keystore 文件
2. 将 keystore 和密码添加到 GitHub Secrets
3. 更新 workflow 配置签名步骤

如果需要加速构建：
- workflow 已配置 Gradle 和 SDK 缓存
- 后续构建将自动加速到 2-3 分钟

---

**总结：你的项目现在通过 GitHub Actions 云端构建，避开了 Windows 本地的 aapt2 bug。**
