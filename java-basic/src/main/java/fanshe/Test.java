package fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by asseghuh on 2023/6/9
 * @desc: todo
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        //获取整个类
        Class c = Class.forName("fanshe.Stu");
        //获取所有的属性?
        Field[] fs = c.getDeclaredFields();
        //获取单个属性
        Field id = c.getDeclaredField("id");
        //获取单个方法
        Method info = c.getDeclaredMethod("info");

        //定义可变长的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加的方法，将每个属性拼接到此字符串中
        //最外边的public定义
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() +"{\n");
        //里边的每一个属性
        for(Field field:fs){
            sb.append("\t");//空格
            sb.append(Modifier.toString(field.getModifiers())+" ");//获得属性的修饰符，例如public，static等等
            sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字
            sb.append(field.getName()+";\n");//属性的名字+回车
        }

        sb.append("}");
        System.out.println(sb);
    }
}
