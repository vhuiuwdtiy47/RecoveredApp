# APK 源码恢复项目

## 项目信息
- **原始 APK**: 18.81.apk
- **包名**: com.android.music
- **版本**: 18.81 (versionCode: 1)
- **目标 SDK**: 35 (Android 15)
- **最小 SDK**: 29 (Android 10)
- **主应用类**: com.xiaomi.vlive.App
- **主 Activity**: com.xiaomi.vlive.MainActivity
- **SHA256**: 3f252d18ccc0b1575aee8ab42f5579960d812b0da3ca316b7bf991d2ee5aad87

## 恢复日期
2025年11月9日

## 使用工具
- **Apktool 2.9.3**: 用于解包资源、AndroidManifest 和 smali 代码
- **JADX**: 用于反编译 DEX 到 Java 源码
- **Java**: 运行反编译工具

## 项目结构
```
RecoveredApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/              # 反编译的 Java 源码
│   │       │   ├── com/
│   │       │   │   ├── xiaomi/vlive/  # 主应用代码
│   │       │   │   ├── android/
│   │       │   │   └── ...        # 其他包（大多被混淆）
│   │       │   ├── androidx/
│   │       │   ├── kotlin/
│   │       │   └── [A-Z]/         # 混淆后的单字母包名
│   │       ├── res/               # 应用资源
│   │       ├── assets/            # 资产文件
│   │       ├── jniLibs/           # Native 库
│   │       └── AndroidManifest.xml
│   ├── build.gradle
│   └── proguard-rules.pro
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## 应用特性分析

### 核心功能
- 视频直播/录制应用 (vlive)
- 媒体投影功能 (MediaProjection)
- 悬浮窗服务 (FloatService)
- 前台服务支持

### 主要权限
- `POST_NOTIFICATIONS` - 通知
- `INTERNET` - 网络访问
- `CAMERA` - 摄像头
- `READ_EXTERNAL_STORAGE` / `WRITE_EXTERNAL_STORAGE` - 存储
- `MANAGE_EXTERNAL_STORAGE` - 管理外部存储
- `FOREGROUND_SERVICE` - 前台服务
- `SYSTEM_ALERT_WINDOW` - 悬浮窗
- `CHANGE_NETWORK_STATE` / `ACCESS_NETWORK_STATE` - 网络状态
- `CHANGE_WIFI_STATE` / `ACCESS_WIFI_STATE` - WiFi 状态

### 主要依赖（已识别）
- AndroidX 核心库
- Kotlin 标准库和协程
- OkHttp 网络库
- Material Design 组件
- Navigation 组件
- Emoji2
- Profile Installer

### 服务组件
1. **FloatService** - 悬浮窗服务
2. **MediaProjectionForegroundService** - 媒体投影前台服务
3. **InitializationProvider** - AndroidX Startup 初始化

## 混淆情况

### 高度混淆
代码已被 **R8/ProGuard 高度混淆**，表现为：
- 大量单字母包名 (A/, B/, C/, ... Z/, a0/, b0/, ...)
- 类名、方法名、变量名被重命名为简短字符
- 保留的包名仅限于：
  - `com.xiaomi.vlive.*` (核心应用包)
  - `com.android.*`
  - `androidx.*`
  - `kotlin.*`
  - 第三方库 (OkHttp, Gson, Tencent, ByteDance 等)

### 无法恢复的元素
1. **原始命名**: 混淆后的类名、方法名、变量名无法恢复
2. **代码注释**: 所有注释在编译时已被移除
3. **泛型细节**: 部分泛型信息在运行时被擦除
4. **内联代码**: 编译器优化导致的内联无法还原
5. **Lambda 表达式**: 反编译后可能变为匿名类
6. **Kotlin 特性**: 部分 Kotlin 语法糖被转换为 Java 等效代码
7. **构建脚本**: 原始 Gradle 配置、自定义任务等

## 后续步骤

### 1. 在 Android Studio 中打开项目
```powershell
# 在项目根目录打开
cd c:\Users\Administrator\Desktop\18.81\RecoveredApp
# 然后用 Android Studio 打开此目录
```

### 2. 同步 Gradle
- 首次打开会自动下载 Gradle 和依赖
- 可能需要安装 Android SDK 35
- 根据错误提示调整依赖版本

### 3. 修复编译错误
可能遇到的问题：
- **缺失依赖**: 根据 import 语句添加对应的库
- **R 类引用**: 确保资源文件完整
- **Kotlin 兼容**: 部分代码可能需要 Kotlin 支持
- **API 兼容**: 某些 API 可能在目标 SDK 中已更改
- **混淆代码逻辑**: 需要手动理解和修复

### 4. 代码清理建议
1. 删除未使用的混淆类（但要小心依赖关系）
2. 对核心类进行语义化重命名
3. 添加必要的注释以便理解
4. 重构过于复杂的反编译代码

### 5. 测试和调试
```powershell
# 编译 Debug 版本
./gradlew assembleDebug

# 安装到设备
adb install app/build/outputs/apk/debug/app-debug.apk
```

### 6. 功能验证
- 测试主界面启动
- 验证摄像头访问
- 测试悬浮窗功能
- 验证录制/投影功能
- 检查网络请求

## 原始文件位置
- **原始 APK 备份**: `backup/18.81.apk`
- **APK 哈希记录**: `backup/HASH.txt`
- **Apktool 解包**: `decompiled/`
- **JADX 反编译**: `src_java/`
- **恢复的项目**: `RecoveredApp/`

## 注意事项

### 法律合规
- 确保你拥有该应用的合法权限
- 仅用于学习、测试或自己开发的应用
- 不要用于侵犯版权或反向工程他人应用

### 技术限制
- 反编译代码不是原始源码，只是近似表示
- 混淆严重影响代码可读性
- 某些运行时动态生成的代码无法完全还原
- Native 库 (JNI) 需要额外的逆向工程工具

### 质量预期
- 代码可能包含编译错误
- 需要大量手工修复才能编译通过
- 运行行为可能与原 APK 有差异
- 性能可能不如原始构建

## 工具链版本
- Apktool: 2.9.3
- JADX: latest
- Gradle: 8.2.0
- Android Gradle Plugin: 8.2.0
- Kotlin: 1.9.0
- Java: 1.8 (target)

## 参考资源
- [Apktool Documentation](https://ibotpeaches.github.io/Apktool/)
- [JADX GitHub](https://github.com/skylot/jadx)
- [Android Developer Docs](https://developer.android.com/)
- [ProGuard/R8 Manual](https://www.guardsquare.com/manual/home)

## 问题排查

### 常见错误及解决方案

1. **Gradle 同步失败**
   - 检查网络连接
   - 更新 Gradle 版本
   - 清理缓存: `./gradlew clean`

2. **依赖未找到**
   - 检查 Maven 仓库配置
   - 搜索正确的依赖坐标
   - 可能需要添加额外的仓库

3. **R 类未生成**
   - 检查 res/ 资源是否完整
   - 清理并重建: `./gradlew clean build`
   - 检查 AndroidManifest.xml 是否有效

4. **Kotlin 编译错误**
   - 确认 Kotlin 插件已启用
   - 检查 kotlinOptions 配置
   - 更新 Kotlin 版本

5. **Native 库加载失败**
   - 检查 jniLibs/ 目录结构
   - 确认 ABI 匹配
   - 可能需要实现 JNI 接口

## 更新历史
- 2025-11-09: 初始恢复完成

---

**本项目由 APK 反编译生成，仅供学习和研究使用。**
