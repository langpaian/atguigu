package com.xf.loop;

/**
 * ClassName: PrintTriangle
 * Package: com.xf.loop
 * Description:
 *      打印一个三角形，菱形
 * @Author 浪拍岸
 * @Create 22/7/2023 下午3:08
 * @Version 1.0
 */
public class PrintTriangle {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*(5-i) - 1; j++) {//i=4
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
