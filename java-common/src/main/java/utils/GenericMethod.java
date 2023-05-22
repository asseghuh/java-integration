package utils;

import entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public class GenericMethod {
    private static final Logger logger = LoggerFactory.getLogger(GenericMethod.class);
    /**
     * 实体类转Map
     * @param
     */
    public static  Map<String, String> entityToMap(Object object) {
        Map<String, String> map = new HashMap<>();
        for (Field field : object.getClass().getDeclaredFields()){
            try {
                boolean flag = field.isAccessible();
                field.setAccessible(true);
                if (field.get(object) != null) {
                    String o = field.get(object).toString();
                    map.put(field.getName().toLowerCase(), o);
                    field.setAccessible(flag);
                }
            } catch (Exception e) {
                logger.error("entityToMap generate exception.", e);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        User user=new User(12,"kangkang");
        Map<String, String> map = GenericMethod.entityToMap(user);
        //logger.error("entityToMap generate exception.");
        //System.out.println(map.toString());
        int a=1;
        int b=0;
        try {
            double r=a/b;
        }catch (Exception e){
            logger.error("hahaha",e);
        }
        System.out.println("程序结束");

    }
}
