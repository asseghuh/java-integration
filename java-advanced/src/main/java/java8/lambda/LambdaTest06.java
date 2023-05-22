package java8.lambda;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by shengR on 2023/4/19
 * @desc: todo
 */
public class LambdaTest06 {
    public static void main(String[] args) {
        Function<Integer, String[]> fun1 = (x) -> new String[x];
        Function<Integer, String[]> fun2 = String[]::new;
        String[] array = fun2.apply(10);
    }
}
