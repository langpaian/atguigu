package com.xf.array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ClassName: CountNumber
 * Package: com.xf.array
 * Description:
 *
 * @Author 浪拍岸
 * @Create 24/7/2023 下午11:23
 * @Version 3.0
 */
public class CountNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int evenSum = 0;
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random()*100+1);
            arr[i] = random;
            sum += random;
            if(random % 2 == 0){
                evenSum += random;
            }else{
                oddCount += 1;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("evenSum = " + evenSum);
        System.out.println("oddCount = " + oddCount);
        System.out.println(Arrays.toString(arr));

        System.out.println("hot-fix test");

//        //方法1：
//        Stream.of(arr).forEach(System.out::println);
//        //方法2：
//        Arrays.stream(arr).forEach(System.out::println);
//        //方法3：
//        Arrays.asList(arr).stream().forEach(s -> System.out.print(s + "\t"));
    }
}
