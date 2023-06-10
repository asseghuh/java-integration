package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by asseghuh on 2023/6/9
 * @desc: todo
 */
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Stu stu=new Stu(1,"aaaaa");

        Class<Stu> c = Stu.class;
        Class<? extends Stu> c1 = stu.getClass();
        Class c2 = Class.forName("fanshe.Stu");


        System.out.println(c==c1);
        System.out.println(c==c2);

        //1，创建对象实例，调用的是无参构造方法
       Stu o=c.newInstance();
       //获取name属性
       Field nameF = c.getDeclaredField("name");
       //打破封装，否则抛出IllegalAccessException
        nameF.setAccessible(true);
       //属性赋值
       nameF.set(o,"lisi");
       //get
        System.out.println(nameF.get(o));
        o.info();


        //2,获取指定参数的构造方法
        Constructor<Stu> constructor = c.getDeclaredConstructor(int.class, String.class);
        //用构造方法创建对象
        Stu zhangsan = constructor.newInstance(12, "zhangsan");
        zhangsan.info();

        //3,获取指定参数的成员方法
        Method lengthM = c.getDeclaredMethod("length", String.class);
        Object res = (int)lengthM.invoke(zhangsan,"abcdefg");
        System.out.println(res);

        //4，获取实现的接口和继承的类
        Class<?>[] interfaces = c.getInterfaces();
        Class<?>[] classes = c.getClasses();
        for(Class zz:classes){
            System.out.println(zz);
        }


    }
}
