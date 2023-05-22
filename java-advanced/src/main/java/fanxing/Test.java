package fanxing;

import entity.User;

/**
 * Created by shengR on 2023/4/1
 * @desc: todo
 */

public class Test<T> {
    public static <T> void test(T t){
        System.out.println(t);
    }

    public <O> T getValue(T t,O o){
        System.out.println(o);
        return t;
    }

    public static void main(String[] args) throws Exception {
        User user=new User();
        System.out.println(user.toString());

    }
}
