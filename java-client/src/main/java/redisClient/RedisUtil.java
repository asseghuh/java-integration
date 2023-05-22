package redisClient;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * Created by shengR on 2023/2/23
 * @desc: todo
 */
public class RedisUtil {
    private volatile static JedisCluster jedisCluster;

    public static JedisCluster getJedisCluster(Properties param) {
        if (jedisCluster == null) {
            synchronized (RedisUtil.class) {
                if (jedisCluster == null) {
                    String serverUrl = param.getProperty("redis.shared");
                    String password = param.getProperty("redis.password");
                    int connectTimeout = Integer.parseInt(param.getProperty("redis.connectTimeout"));
                    int soTimeout = Integer.parseInt(param.getProperty("redis.soTimeout"));
                    int maxAttempts = Integer.parseInt(param.getProperty("redis.maxAttempts"));

                    Set<HostAndPort> hostAndPort = getHostAndPort(serverUrl);
                    JedisPoolConfig jedisPoolConfig = getJedisPoolConfig(param);
                    jedisCluster = new JedisCluster(hostAndPort, connectTimeout, soTimeout, maxAttempts, password, jedisPoolConfig);
                }
            }
        }
        return jedisCluster;
    }

    private static JedisPoolConfig getJedisPoolConfig(Properties param) {
        int redisMaxActive = Integer.parseInt(param.getProperty("redis.maxActive"));
        int redisMaxIdle = Integer.parseInt(param.getProperty("redis.maxIdle"));
        int redisMaxWait = Integer.parseInt(param.getProperty("redis.maxWait"));
        boolean redisTestOnReturn = Boolean.parseBoolean(param.getProperty("redis.testOnReturn"));
        boolean redisTestOnBorrow = Boolean.parseBoolean(param.getProperty("redis.testOnBorrow"));

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(redisMaxActive);
        jedisPoolConfig.setMaxWaitMillis(redisMaxWait);
        jedisPoolConfig.setMaxIdle(redisMaxIdle);
        jedisPoolConfig.setTestOnReturn(redisTestOnReturn);
        jedisPoolConfig.setTestOnBorrow(redisTestOnBorrow);
        return jedisPoolConfig;
    }

    private static Set<HostAndPort> getHostAndPort(String serverUrl) {
        String[] serverUrlArr = serverUrl.split(";");
        Set<HostAndPort> hostAndPorts = new HashSet<HostAndPort>();
        for (String servernUrl : serverUrlArr) {
            String[] arr = servernUrl.split(":");
            hostAndPorts.add(new HostAndPort(arr[0].trim(), Integer.parseInt(arr[1].trim())));
        }
        return hostAndPorts;
    }

    public static void close() {
        try {
            if (jedisCluster != null) {
                jedisCluster.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jedisCluster=null;
        }
    }
}
