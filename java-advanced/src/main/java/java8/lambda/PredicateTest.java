package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by shengR on 2023/4/19
 * @desc: todo
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Java", "html5","JavaScript", "C++", "hibernate", "PHP");
        //判断列表长度是否大于10
        Predicate<List> p1= list -> list.size()>10;
        boolean ans = p1.test(lists);
        System.out.println(ans);

        //判断列表是否包含"Java"
        Predicate<List> p2= list -> list.contains("Java");
        boolean ans2 = p2.test(lists);
        System.out.println(ans2);
    }
}
