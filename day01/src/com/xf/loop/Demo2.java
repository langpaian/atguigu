package com.xf.loop;

/**
 * ClassName: Demo2
 * Package: com.xf.loop
 * Description:
 * While循环
 *      1-100之间的奇数之和
 * @Author 浪拍岸
 * @Create 22/7/2023 上午10:37
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < 100) {
            sum += i;
            i += 2;
        }
        System.out.println("1-100的偶数和sum = " + sum);
    }
}
