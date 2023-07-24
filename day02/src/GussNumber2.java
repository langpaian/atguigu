import java.util.Random;

/**
 * ClassName: GussNumber2
 * Package: PACKAGE_NAME
 * Description:
 *      随机生成10个随机数
 * @Author 浪拍岸
 * @Create 23/7/2023 上午9:03
 * @Version 1.0
 */
public class GussNumber2 {
    public static void main(String[] args) {
        Random random = new Random();

        int cnt_evenNumber = 0;
        for (int j = 0; j < 10; j++) {
            int x = random.nextInt(100) + 1;
            System.out.println(x);

            if(x%2==0){
                cnt_evenNumber++;
            }
        }
        System.out.println("偶数个数为 = " + cnt_evenNumber);
    }
}
