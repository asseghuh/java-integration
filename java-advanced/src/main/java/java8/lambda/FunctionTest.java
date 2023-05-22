package java8.lambda;

import java.util.function.Function;

/**
 * Created by shengR on 2023/4/19
 * @desc: todo
 */
public class FunctionTest {
    public static void main(String[] args) {
        //传入一个String类型名称,返回一个people对象
        Function<String,People> func= People::new;
        People p1=func.apply("kangkang");

        //需求改变：创建对象前给name加一个姓氏前缀，创建对象后获取姓名长度
        Function<String,String> before = s ->"wang-"+s;
        Function<People,Integer> after= s -> s.getName().length();
        //这段代码需要好好理解，逻辑是先对T应用before规则，再对R应用after规则
        Integer len = func.compose(before).andThen(after).apply("kangkang");
        System.out.println("姓名长度："+len);
    }
}
