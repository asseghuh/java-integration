package java8;

import  entity.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {

        User user1=new User(1,"aaaaa");
        User user2=new User();
        Map<String, User> map = new HashMap<>();
        map.put("a",user1);

        //创建
        Optional<User> op1 = Optional.of(user1);
        Optional<User> op3 = Optional.of(user2);
        Optional op2=Optional.ofNullable(null);
        Optional op4=Optional.empty();

        //取值
        System.out.println(op3.get());// get()方法一般不直接调用。改方法在内部值为null时调用会抛出NoSuchElementException异常
        System.out.println( op4.orElse("空值"));// orElse(T),获取内部值，如果内部值为null,取T作为返回值
        User user4 = op1.orElseGet(() -> new User());
        User user5 = op1.orElseThrow(() -> new Exception());

        //判断
        System.out.println( op1.isPresent() );
        //在值存在的情况下进行后续操作
        op2.ifPresent(user -> System.out.println(user));


        // map方法，在内部值不为null的情况下，将内部值转换为新的值。内部值为null,则不执行map中的转换函数。
        String str = Optional.ofNullable(map.get("b"))
                .map(value -> value.getName())
                .orElse("为null值");
        System.out.println(str);

        // flatMap方法，与map的区别在于map传入的函数返回值为Optional对象
        String text1 = Optional.ofNullable(map.get("a"))
                .flatMap((value) -> Optional.of(value.getName()))
                .orElse("为null值");
        System.out.println(text1);

        // filter方法，对 Optional 中包含的值进行过滤，如果包含的值满足条件，那么还是返回这个 Optional；否则返回 Optional.empty。
        Optional<User> user3 = Optional.ofNullable(map.get("a")).filter(user -> user.getName().length() > 4);
        System.out.println(user3);

        test1();
        test2(user1);
        test3(map);

    }
    //使用场景：快车车型下单被选中次数
/*    Optional<OrderStats> optional = Optional.of(orderStats);
      optional.map(OrderStats::getEconomyCarOrderCnt)
            .ifPresent(value -> passengerOrderPeriodIndicator.setPassenger_economy_car_order_cnt_day1(String.valueOf(value)));*/

    //使用场景一
    public static void test1(){
        User u=new User(1,"aaaaa");
        Map<String, User> map = new HashMap<>();
        map.put("a",u);

        User user=map.get("a");
        if(user!=null){
            System.out.println(user.getName());
        }

        //改写
        Optional.ofNullable(user).ifPresent( p -> System.out.println(p.getName()) );
    }

    //使用场景二
    public static void test2(User user) throws Exception {

        if(user==null || user.getName()==null){
            throw new Exception();
        }
        String name=user.getName();

        //改写
        String name2 = Optional.ofNullable(user).filter(p -> p.getName() != null).orElseThrow(() -> new Exception()).getName();

    }
    //使用场景三
    public static void test3(Map<String,User> map) throws Exception {
        if(map!=null){
            User user=map.get("aaa");
            if(user!=null){
                String name=user.getName();
                if(name!=null){
                    int size= name.length();
                }
            }

        }
        //改写
        int size=Optional.ofNullable(map)
                .map( p-> p.get("aaa") )
                .map( p->p.getName() )
                .map( p->p.length() )
                .orElse(0);

    }








}
