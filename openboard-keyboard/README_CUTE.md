# OpenBoard Cute Edition 🌸

这是一个经过UI美化的OpenBoard键盘应用，采用了简约可爱的粉色/薰衣草配色风格。

## 主要修改

### 1. 配色方案 (colors.xml)
- 采用柔和的粉色 (#F48FB1) 作为主色调
- 温暖的奶油白 (#FFF5F8) 作为背景
- 薰衣草紫 (#CE93D8) 用于深色主题
- 整体简约可爱的视觉风格

### 2. 应用图标
- 全新的可爱风格应用图标
- 粉色渐变背景
- 简洁的键盘设计

### 3. commitCurrentAutoCorrection 方法位置
该方法位于以下文件中：
```
app/src/main/java/org/dslul/openboard/inputmethod/latin/inputlogic/InputLogic.java
第 2119 行
```

## 如何构建 APK

### 环境要求
- Android Studio (最新版本)
- Android SDK 21+
- JDK 11+
- Gradle (项目自带 gradlew)

### 构建步骤

1. **安装 Android Studio**
   - 从 https://developer.android.com/studio 下载并安装

2. **打开项目**
   ```bash
   # 在 Android Studio 中选择 File -> Open -> 选择本项目目录
   ```

3. **同步 Gradle**
   - Android Studio 会自动提示同步 Gradle
   - 点击 "Sync Now" 等待完成

4. **构建 APK**
   ```bash
   # 方法1: 命令行构建
   cd openboard-keyboard
   ./gradlew assembleDebug
   
   # APK 输出位置:
   # app/build/outputs/apk/debug/app-debug.apk
   ```

   或者在 Android Studio 中:
   - Build -> Build Bundle(s) / APK(s) -> Build APK(s)

5. **签名发布版 APK** (可选)
   ```bash
   ./gradlew assembleRelease
   ```

## 项目结构

```
openboard-keyboard/
├── app/
│   ├── src/main/
│   │   ├── java/           # Java 源代码
│   │   ├── res/
│   │   │   ├── values/
│   │   │   │   └── colors.xml  # 颜色配置 (已修改)
│   │   │   ├── drawable/   # 图标和样式资源
│   │   │   └── mipmap-*/   # 应用图标 (已修改)
│   │   └── jni/            # Native 代码
│   └── build.gradle
└── README.md
```

## 原始项目

本项目基于 [openboard-team/openboard](https://github.com/openboard-team/openboard) 进行修改。

## 许可证

Apache License 2.0
