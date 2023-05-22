package redisClient;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by shengR on 2023/2/23
 * @desc: todo
 */
public class JedisTest {
    private static Jedis jedis;
    static {
        jedis = new Jedis("redis01.dev02.dtmpl.ws.srv",6381);
        jedis.auth("12345678");
    }

    //1,String类型
    public static void op01(){
        //1,设置k-v值
        jedis.set("name","shengr");
        //2，获取k对应v值
        String username=jedis.get("name");
        System.out.println(username);
        //3，设置值的同时指定过期时间,方法为setex,第二参数指定过期时间，单位秒
        jedis.setex("flag",30,"1");
        //4，删除key
        jedis.del("flag");
        //5,关闭连接
        jedis.close();
    }
    //2,List类型
    public static void op02(){
        //lpush 元素依次插入到列表首位
        jedis.lpush("words","a","b");
        //rpush 元素依次插入到列表末位
        jedis.rpush("words","c","d","e");
        //lrange 获取下标从start到end的元素，下标从0开始并且包含end处的值。另外，下标可以是负数，表示倒数第几个值,-1即表示最后一位。
        List<String> words = jedis.lrange("words", 0, -1);
        System.out.println(words);
        //lpop 从列表首位弹出一个值
        String word1 = jedis.lpop("words");
        //rpop 从列表末位弹出一个值
        String word2 = jedis.rpop("words");
        System.out.println(word1+"--"+word2);
    }

    //3,Hash类型，同一个key对应一组k-v值
    public static void op03(){
        //设值
        jedis.hset("user","name","shengr");
        jedis.hset("user","age","12");
        jedis.hset("user","city","sz");
        //获取单个值
        String name=jedis.hget("user","name");
        System.out.println(name);
        //遍历所有值
        Map<String,String> user = jedis.hgetAll("user");
        for (String key : user.keySet()) {
            String value = user.get(key);
            System.out.println(key+":"+value);
        }
        //删除key中的一个或多个指定fileld,不存在的字段忽略
        jedis.hdel("user","city","sex");
    }

    //4-1,Set类型：集合中元素唯一
    public static void op04(){
        jedis.sadd("distinctWords","a","b","a");
        Set<String> distinctWords = jedis.smembers("distinctWords");
        System.out.println(distinctWords);

    }
    //4-2,有序Set类型: score指定排名分值，元素按照此分值从小到大排序
    public static void op05(){
        jedis.zadd("sortedset",3,"ding");
        jedis.zadd("sortedset",5,"seng");
        jedis.zadd("sortedset",4,"ming");
        Set<String> sortedset = jedis.zrange("sortedset", 0, -1);
        System.out.println(sortedset);
    }

    public static void main(String[] args) {
        op01();
        op02();
        op03();
        op04();
        op05();
    }
}
