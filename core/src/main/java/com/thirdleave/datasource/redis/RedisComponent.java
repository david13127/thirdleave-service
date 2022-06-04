package com.thirdleave.datasource.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


@Component
public class RedisComponent {

    private final Logger logger = LoggerFactory.getLogger(RedisComponent.class);

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public static StringRedisTemplate redis;

    //@PostConstruct注解效果：在Bean初始化之后（构造方法和@Autowired之后）执行指定操作。
    @PostConstruct
    public void getRedisTemplate(){
        redis = this.stringRedisTemplate;
        logger.info("初始化-------redisTemplate----");
    }

}
