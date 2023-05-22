package java8.lambda;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class LambdaTest {
    public static void main(String[] args) {
        Action action=Integer::toString;
        System.out.println(action.run(9));
    }
}
