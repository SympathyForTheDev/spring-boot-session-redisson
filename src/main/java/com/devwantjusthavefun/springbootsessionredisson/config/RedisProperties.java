package com.devwantjusthavefun.springbootsessionredisson.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("redis")
public class RedisProperties
{
    private String addresses;
    private String password;

    public String getAddresses()
    {
        return addresses;
    }

    public void setAddresses(final String addresses)
    {
        this.addresses = addresses;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }
}
