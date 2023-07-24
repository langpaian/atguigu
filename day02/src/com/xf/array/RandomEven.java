package com.xf.array;

/**
 * ClassName: RandomEven
 * Package: com.xf.array
 * Description:
 *      随机产生10个100以内的偶数存入数组中，并遍历显示
 * @Author 浪拍岸
 * @Create 23/7/2023 上午11:48
 * @Version 1.0
 */
public class RandomEven {
    public static void main(String[] args) {
        int[] arr = new int[10];//新建一个大小为10的数组
        for (int i = 0; i < 10; ) {//循环
            int x = (int) (Math.random() * 100);//生成一个随机数
            if(x % 2 == 0){//判断是否为偶数
                arr[i] = x;//是的话，存入数组，并且下标加1
                i++;
            }
        }
        System.out.print("10个随机偶数：");
        for(int n : arr){
            System.out.print(n +"\t");
        }
        System.out.println();
    }
}
