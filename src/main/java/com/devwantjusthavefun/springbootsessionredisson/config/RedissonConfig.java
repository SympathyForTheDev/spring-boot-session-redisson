package com.devwantjusthavefun.springbootsessionredisson.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.FstCodec;
import org.redisson.config.Config;
import org.redisson.spring.session.config.EnableRedissonHttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRedissonHttpSession
public class RedissonConfig
{
    private static final Logger LOGGER = LoggerFactory.getLogger(RedissonConfig.class);

    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public RedissonClient redisson()
    {
        LOGGER.info("Redisson Configuration loaded!");

        final Config config = baseConfig();
        config.useSingleServer()
                .setAddress(redisProperties.getAddresses())
                .setPassword(redisProperties.getPassword());

        return Redisson.create(config);
    }

    private Config baseConfig()
    {
        return new Config()
                .setCodec(new FstCodec());
    }

}