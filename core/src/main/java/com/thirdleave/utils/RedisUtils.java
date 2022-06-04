package com.thirdleave.utils;

import com.thirdleave.datasource.redis.RedisComponent;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisUtils {
    private static StringRedisTemplate stringRedisTemplate = RedisComponent.redis;

    public static String get(String key) {
        if (stringRedisTemplate.hasKey(key)) {
            return stringRedisTemplate.opsForValue().get(key);
        }
        return "";
    }

    public static void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
}
