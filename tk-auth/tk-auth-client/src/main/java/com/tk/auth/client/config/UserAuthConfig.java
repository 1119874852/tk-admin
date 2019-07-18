package com.tk.auth.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-17:23
 */
@Data
public class UserAuthConfig {
    @Value("${auth.user.token-header}")
    private String tokenHeader;

    private byte[] pubKeyByte;
}
