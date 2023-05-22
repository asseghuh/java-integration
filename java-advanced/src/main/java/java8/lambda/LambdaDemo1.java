package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class LambdaDemo1 extends Object{

    public static void main(String[] args) {
        //假如一个list中的元素要排序
        List<String> list = Arrays.asList("hello","tom","apple","bbc");
        //之前的排序我们可以这样写
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(list.toString());
    }
}
