# 快速开始指南

## 前置要求
- Android Studio (最新版本推荐)
- JDK 17 或更高版本
- Android SDK 35
- 至少 8GB RAM

## 安装步骤

### 1. 打开项目
```powershell
# 导航到项目目录
cd c:\Users\Administrator\Desktop\18.81\RecoveredApp

# 使用 Android Studio 打开此文件夹
# File -> Open -> 选择 RecoveredApp 目录
```

### 2. 配置 Android SDK
在 Android Studio 中：
- Tools -> SDK Manager
- 确保已安装 Android 15 (API 35)
- 安装 Build Tools 35.x.x

### 3. 同步项目
- 点击 "Sync Project with Gradle Files" 按钮
- 等待依赖下载完成（首次可能需要较长时间）

### 4. 修复错误
根据 IDE 提示修复以下常见问题：
- 添加缺失的依赖
- 修正导入语句
- 调整 API 级别

### 5. 构建项目
```powershell
# 清理构建
./gradlew clean

# 构建 Debug 版本
./gradlew assembleDebug

# 或者在 Android Studio 中
# Build -> Build Bundle(s) / APK(s) -> Build APK(s)
```

### 6. 运行应用
- 连接 Android 设备或启动模拟器
- 点击 Run 按钮 (绿色三角形)
- 或使用命令: `./gradlew installDebug`

## 故障排除

### Gradle 下载慢
修改 `gradle/wrapper/gradle-wrapper.properties`:
```
distributionUrl=https\://mirrors.cloud.tencent.com/gradle/gradle-8.2-bin.zip
```

### 依赖下载失败
在 `settings.gradle` 中添加国内镜像:
```groovy
maven { url 'https://maven.aliyun.com/repository/public/' }
maven { url 'https://maven.aliyun.com/repository/google/' }
```

### 编译错误
1. 查看 Build 面板的错误信息
2. 根据错误类型添加相应依赖
3. 确保所有 import 语句正确
4. 检查资源文件是否完整

### 运行时崩溃
1. 查看 Logcat 日志
2. 检查权限是否正确申请
3. 验证 Native 库是否正确加载
4. 对比原 APK 的行为差异

## 下一步
- 阅读 README.md 了解项目详情
- 探索 `com.xiaomi.vlive` 包下的核心代码
- 根据业务需求修改功能
- 重构混淆的代码以提高可读性

## 开发建议
1. 使用版本控制 (Git) 跟踪更改
2. 逐步重命名混淆的类和方法
3. 添加注释记录理解的逻辑
4. 编写测试确保功能正常
5. 定期备份工作成果
