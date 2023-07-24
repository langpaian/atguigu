package com.xf.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: InputAge
 * Package: com.xf.array
 * Description:
 *
 * @Author 浪拍岸
 * @Create 23/7/2023 下午2:37
 * @Version 1.0
 */
public class InputAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ages));
    }
}
