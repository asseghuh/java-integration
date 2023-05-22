package java8.lambda;

import java.util.function.Consumer;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class LambdaTest03 {
    public static void main(String[] args) {
        Consumer<Integer> con = System.out::println;
        con.accept(200);
    }
}
