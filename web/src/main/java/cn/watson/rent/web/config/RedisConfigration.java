/*
package cn.watson.rent.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Configuration
public class RedisConfigration {

    private String host;

    private int port;

    private int timeout=2;

    private int maxIdle=2;

    private long maxWaitMillis=2;

    private String password;

    private boolean blockWhenExhausted=true;

//    @Bean
    public JedisPool redisPoolFactory() throws Exception {
        log.info("JedisPool注入成功！！");
        log.info("redis地址：" + host + ":" + port);
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        // 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
        jedisPoolConfig.setBlockWhenExhausted(blockWhenExhausted);
        // 是否启用pool的jmx管理功能, 默认true
        jedisPoolConfig.setJmxEnabled(true);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "localhost",
                6379, 100, null);
        return jedisPool;
    }

    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMinIdle(100);
        config.setMaxIdle(200);
        config.setMaxTotal(1000);
        config.setMaxWaitMillis(1000);
        config.setTestOnBorrow(true);
        return config;
    }

    @Bean("jedisSentinelPool")
    public JedisSentinelPool jedisSentinelPool() {
        Set<String> sentinel = new HashSet<>();
        sentinel.add("10.0.55.79:26379");
        JedisSentinelPool pool = new JedisSentinelPool("mymaster", sentinel,
                jedisPoolConfig(),"abcd");
        return pool;
    }

}
*/
