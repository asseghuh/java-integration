package redisClient;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;
import java.util.HashSet;

import java.util.Set;

/**
 * Created by shengR on 2023/2/23
 * @desc: todo
 */
public class JedisClusterTest {
    public static JedisCluster getJedisCluster() {

        //1设置集群节点的ip和端口信息
        Set<HostAndPort> hostAndPorts = new HashSet<HostAndPort>();
        HostAndPort hostAndPort = new HostAndPort("redis01.dev02.dtmpl.ws.srv",6379);
        hostAndPorts.add(hostAndPort);
        //2设置密码
        String password = "sfakjfiju99jjf87LJSDDU8";
        //3连接超时时间
        int connectTimeout = 5000;
        //4读写超时时间
        int soTimeout = 5000;
        //5最大重连次数
        int maxAttempts = 3;
        //6连接池参数
        JedisPoolConfig jedisPoolConfig = getJedisPoolConfig();

        JedisCluster jedisCluster = new JedisCluster(hostAndPorts, connectTimeout, soTimeout, maxAttempts, password, jedisPoolConfig);
        //注意：JedisCluster最好设置成单例，且一般不需要执行close操作,而是由连接池管理。
        return jedisCluster;
    }
    private static JedisPoolConfig getJedisPoolConfig() {
        //1,pool容量，即最大连接数
        int maxTotal = 1024;
        //2,pool最大空闲连接数，默认值是8
        int maxIdle = 200;
        //3,等待可用连接的最大时间，单位是毫秒，默认值为-1，表示永不超时。
        int maxWaitMillis = 10000;
        //4,在返回一个连接对象时，是否进行有效性检查
        boolean testOnReturn = true;
        //5,借用一个连接对象时，是否进行有效性检查
        boolean testOnBorrow = true;

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        jedisPoolConfig.setTestOnReturn(testOnReturn);
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);

        return jedisPoolConfig;
    }
    public static void main(String[] args) {
        JedisCluster jc=getJedisCluster();
        jc.set("myname","shengr");
        System.out.println(jc.get("myname"));
    }
}
