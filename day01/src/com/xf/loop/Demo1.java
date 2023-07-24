package com.xf.loop;

/**
 * ClassName: Demo1
 * Package: com.xf.loop
 * Description:
 *      for循环练习
 * @Author 浪拍岸
 * @Create 22/7/2023 上午10:12
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100之间的偶数之和 = " + sum);
    }
}
