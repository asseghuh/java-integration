package redisClient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import redis.clients.jedis.JedisCluster;

import java.util.Properties;

/**
 * Created by shengR on 2023/2/23
 * @desc: todo
 */
public class RedisReadWrite {
    private volatile static RedisReadWrite instance;
    private static JedisCluster jedisCluster;
    private static int ipRedisExpireSeconds;
    private static Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

    private RedisReadWrite(Properties params) {
        jedisCluster = RedisUtil.getJedisCluster(params);
        ipRedisExpireSeconds = Integer.parseInt(params.getProperty("ip.redis.expire.seconds"));
    }

    public static RedisReadWrite getInstance(Properties params) {
        if (instance == null) {
            synchronized (RedisReadWrite.class) {
                if (instance == null) {
                    instance = new RedisReadWrite(params);
                }
            }
        }
        return instance;
    }

    public String get(String ip) {
        String r = jedisCluster.get(ip);
        return r;
    }

    public void set(String ip, String r) {
        jedisCluster.set(ip, r);
        if (false) {
            jedisCluster.expire(ip, ipRedisExpireSeconds);
        }
    }
}
