# Android Studio 本地构建修复指南

## 问题
Android Studio 报错：
```
Unsupported class file major version 65
```

## 原因
- Android Studio 内置的 Gradle 使用了错误的 JDK 版本（JDK 21）
- 我们的项目需要 JDK 17

## 已修复
在 `gradle.properties` 中添加了强制使用 JDK 17 的配置：
```properties
org.gradle.java.home=C:\\xinwenjianjia\\jdk-17
```

## 操作步骤

### 1. 重新同步 Gradle
在 Android Studio 中：
1. 点击顶部的 **File** → **Sync Project with Gradle Files**
2. 或点击提示栏的 **Sync Now** 按钮
3. 等待同步完成（约 1-2 分钟）

### 2. 清理项目
```
Build → Clean Project
```

### 3. 重新构建
```
Build → Rebuild Project
```

### ⚠️ 重要提醒

**本地 Windows 构建仍然会在资源编译阶段失败**（aapt2 路径 bug），但至少可以：
- ✅ Gradle 同步成功
- ✅ 代码编辑和提示正常
- ✅ Kotlin 编译通过
- ❌ 资源合并会失败（InvalidPathException）

**如果要获得完整的 APK，请使用 GitHub Actions 云端构建。**

## 如果仍然报错

### 方法 1：在 Android Studio 设置 JDK
1. **File** → **Settings** (或 **Ctrl+Alt+S**)
2. **Build, Execution, Deployment** → **Build Tools** → **Gradle**
3. **Gradle JDK** 选择：`C:\xinwenjianjia\jdk-17`
4. 点击 **Apply** 和 **OK**
5. 重新同步项目

### 方法 2：删除 Gradle 缓存重新开始
```powershell
cd C:\Users\Administrator\Desktop\18.81\RecoveredApp
Remove-Item -Recurse -Force .gradle
Remove-Item -Recurse -Force app\build
Remove-Item -Recurse -Force build
```

然后在 Android Studio 中重新同步。

---

**总结：现在 Android Studio 可以正常编辑代码了，但完整构建请用 GitHub Actions。**
