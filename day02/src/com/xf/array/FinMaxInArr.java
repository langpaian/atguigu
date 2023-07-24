package com.xf.array;

import java.util.Arrays;

/**
 * ClassName: FinMaxInArr
 * Package: com.xf.array
 * Description:
 *      寻找数组中的最大值
 * @Author 浪拍岸
 * @Create 23/7/2023 下午4:19
 * @Version 1.0
 */
public class FinMaxInArr {

    public static void main(String[] args) {
        int[] arr = new int[]{1,-3,5,9,-4,3,3,4,6,7,8,2,23,4,2};
        long start = System.currentTimeMillis();

        int maxNum = arr[0];
        int i = 1;
        while(i < arr.length){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
            i++;
        }
        System.out.println(maxNum);
        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start) + "ms");

    }
}
