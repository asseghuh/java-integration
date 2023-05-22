package java8.lambda;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class LambdaTest01 {
    public String test(int i){
        return "i="+i;
    }
    public static void main(String[] args) {
        LambdaTest01 t = new LambdaTest01();
        Action action=t::test;
        System.out.println(action.run(10));
    }
}
