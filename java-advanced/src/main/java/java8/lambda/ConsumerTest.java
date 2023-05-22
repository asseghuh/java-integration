package java8.lambda;

import java.util.function.Consumer;

/**
 * Created by shengR on 2023/4/19
 * @desc: todo
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String>  consumer= System.out::print;
        consumer.accept("打印字符串");
    }
}
