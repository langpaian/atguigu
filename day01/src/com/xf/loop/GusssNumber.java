package com.xf.loop;

import java.util.Scanner;

/**
 * ClassName: GusssNumber
 * Package: com.xf.loop
 * Description:
 *
 * @Author 浪拍岸
 * @Create 22/7/2023 上午11:50
 * @Version 1.0
 */
public class GusssNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int random_num = (int) (Math.random() * 100 + 1);
        int cnt = 0;
        do{
            System.out.println("your guess number is =");
            guess = scanner.nextInt();
            if(guess == random_num){
                break;
            }else if(guess > random_num){
                System.out.println("大了");
            }else {
                System.out.println("小了");
            }
            cnt++;
        }while (true);
        System.out.println("you have try " +cnt+ " times");
    }
}
