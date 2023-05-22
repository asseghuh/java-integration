package java8.lambda;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class LambdaTest04 {
    public static void main(String[] args) {
        //会调用相应参数的构造器
        CreatePeople createPeople=People::new;
        People people = createPeople.create("kangkang");
        people.say();
    }
}
