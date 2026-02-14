package org.dslul.openboard.inputmethod.latin.utils;

/**
 * 猫模式管理器
 * 管理猫咪模式的开关状态
 * 长按Shift键可以切换猫模式
 */
public class CatModeManager {
    private static boolean sCatModeEnabled = false;
    
    /**
     * 切换猫模式
     * @return 切换后的状态
     */
    public static boolean toggleCatMode() {
        sCatModeEnabled = !sCatModeEnabled;
        return sCatModeEnabled;
    }
    
    /**
     * 获取猫模式状态
     * @return 是否开启猫模式
     */
    public static boolean isCatModeEnabled() {
        return sCatModeEnabled;
    }
    
    /**
     * 设置猫模式状态
     * @param enabled 是否开启
     */
    public static void setCatModeEnabled(boolean enabled) {
        sCatModeEnabled = enabled;
    }
    
    /**
     * 变换文本为猫咪风格
     * @param text 原始文本
     * @return 变换后的文本
     */
    public static String transformText(String text) {
        if (!sCatModeEnabled || text == null || text.isEmpty()) {
            return text;
        }
        
        String result = text;
        // 简单的猫咪化变换
        result = result.replace("人", "人喵");
        result = result.replace("你", "你喵");
        result = result.replace("我", "猫");
        result = result.replace("个", "只");
        
        // 在句尾添加喵
        if (result.length() > 0) {
            char lastChar = result.charAt(result.length() - 1);
            String punctuation = "。！？,.?!";
            if (punctuation.indexOf(lastChar) != -1) {
                result = result.substring(0, result.length() - 1) + "喵~" + lastChar;
            }
        }
        
        return result;
    }
}
