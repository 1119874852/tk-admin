package com.tk.gate;

import com.tk.auth.client.EnableAceAuthClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-17:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAceAuthClient
@EnableFeignClients({"com.tk.auth.client.feign","com.tk.gate.feign"})
public class GatewayServerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerBootstrap.class, args);
    }
}
