package com.tk.auth.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-17:11
 */
@Configuration
@ComponentScan({"com.tk.auth.client","com.tk.auth.common"})
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }
}
