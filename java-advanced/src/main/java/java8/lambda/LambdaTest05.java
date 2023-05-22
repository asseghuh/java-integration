package java8.lambda;

/**
 * Created by shengR on 2023/4/19
 * @desc: todo
 */
public class LambdaTest05 {
    public static void main(String[] args) {
        Eat<String> t=Model::test;
    }
}
class Model{
    public static void test(String a){
        System.out.println(a);
    }
}
interface Eat<T>{
    void eat(T t);
}
