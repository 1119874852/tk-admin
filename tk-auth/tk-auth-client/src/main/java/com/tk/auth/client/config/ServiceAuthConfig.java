package com.tk.auth.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-17:22
 */
@Data
public class ServiceAuthConfig {
    private byte[] pubKeyByte;
    @Value("${auth.client.id:null}")
    private String clientId;
    @Value("${auth.client.secret}")
    private String clientSecret;
    @Value("${auth.client.token-header}")
    private String tokenHeader;
    @Value("${spring.application.name}")
    private String applicationName;
}
