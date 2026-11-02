package com.jsp.centralized_cache_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class CacheConfig {

    @Bean
    public RedisConnectionFactory getRedisConnectionFactory() {

        return new LettuceConnectionFactory();

    }

    @Bean
    public RedisTemplate getRedisTemplate() {

        RedisTemplate redisTemplate = new RedisTemplate();

        redisTemplate.setConnectionFactory(getRedisConnectionFactory());

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());

        return redisTemplate;
    }

}