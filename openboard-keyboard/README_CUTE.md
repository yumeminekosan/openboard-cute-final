# 猫咪 OpenBoard ฅ^•ﻌ•^ฅ

<p align="center">
  <img src="https://img.shields.io/badge/状态-喵~-brightgreen" alt="状态">
  <img src="https://img.shields.io/badge/基础-OpenBoard-blue" alt="基础">
  <img src="https://img.shields.io/badge/许可证-GPLv3-blue" alt="许可证">
</p>

基于 [OpenBoard](https://github.com/openboard-team/openboard) 的猫咪输入法，100% 开源，带有猫咪文字变身功能！

## ✨ 特色功能

### 🐱 猫咪模式
- **长按 Shift 键**：切换猫模式开关
- **长按 z 键**：选择输入 "喵" 或 "咪"

猫模式开启后，文字会自动变成猫咪风格：
- 「我是一个人。」→ 「猫是一只人咪喵~。」

### 🎨 春日青色主题
温柔的浅灰蓝配色方案，视觉舒适不刺眼。

## 📦 项目系列

| 版本 | 基础项目 | 链接 |
|------|----------|------|
| final | OpenBoard | [本仓库](https://github.com/yumeminekosan/openboard-cute-final) |
| final-final | Trime (RIME) | [链接](https://github.com/yumeminekosan/openboard-cute-final-final) |
| final-final-final | 自定义 IME | [链接](https://github.com/yumeminekosan/openboard-cute-final-final-final) |

## 🔧 构建

```bash
# 克隆仓库
git clone https://github.com/yumeminekosan/openboard-cute-final.git

# 进入项目目录
cd openboard-cute-final/openboard-keyboard

# 编译 Debug APK
./gradlew assembleDebug
```

## 📝 修改说明

基于原版 OpenBoard 的修改：

1. **KeyboardTextsTable.java** - z 键添加喵/咪选项
2. **PointerTracker.java** - Shift 长按切换猫模式
3. **CatModeManager.java** - 猫模式状态管理
4. **配色文件** - 春日青色主题

## 🙏 致谢

- [OpenBoard](https://github.com/openboard-team/openboard) - 基础项目
- [AOSP Keyboard](https://android.googlesource.com/platform/packages/inputmethods/LatinIME/) - 原始代码

## 📄 许可证

GNU General Public License v3.0

---

<p align="center">
  <b>喵~ 基于 OpenBoard 的可爱输入法</b>
</p>
