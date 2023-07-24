package com.xf.array;

/**
 * ClassName: ToUper
 * Package: com.xf.array
 * Description:
 *
 * @Author 浪拍岸
 * @Create 23/7/2023 下午2:31
 * @Version 1.0
 */
public class ToUper {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char)('a' + i);
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(chars[i]+"->"+ (char)(chars[i] - 32));
        }
    }
}
