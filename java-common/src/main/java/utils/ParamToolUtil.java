package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by shengR on 2023/2/23
 * @desc: todo
 */
public class ParamToolUtil {
    private static Properties properties;

    public static Properties getProperties(){
        properties=new Properties();
        try {
            InputStream in=ParamToolUtil.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
