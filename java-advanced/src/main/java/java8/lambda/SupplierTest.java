package java8.lambda;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by shengR on 2023/4/19
 * @desc: todo
 */
public class SupplierTest {
    public static void main(String[] args) {
        //生成一个八位的随机字符串
        Supplier<String> supplier = ()->{
            String base = "abcdefghijklmnopqrstuvwxyz0123456789";
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 8; i++) {
                //生成[0,base.length)之间的随机数
                int number = random.nextInt(base.length());
                sb.append(base.charAt(number));
            }
            return sb.toString();
        };
        String ans = supplier.get();
        System.out.println(ans);
    }
}
