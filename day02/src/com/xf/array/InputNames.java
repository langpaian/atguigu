package com.xf.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: InputNames
 * Package: com.xf.array
 * Description:
 *
 * @Author 浪拍岸
 * @Create 23/7/2023 下午2:52
 * @Version 1.0
 */
public class InputNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        System.out.println(Arrays.toString(names));
    }
}
