package java8.lambda;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class AdderTest {
    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;

        System.out.println(adder.add(1,2));
    }
}
