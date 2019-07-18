package com.tk.auth.service.util;

import com.tk.auth.common.util.jwt.IJWTInfo;
import com.tk.auth.common.util.jwt.JWTHelper;
import com.tk.auth.service.config.KeyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-11:00
 * json web令牌 TOKEN工具
 */
@Component
public class JwtTokenUtil {
    @Value("${jwt.expire}")
    private int expire;

    @Autowired
    private KeyConfiguration keyConfiguration;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public String generateToken(IJWTInfo jwtInfo) throws Exception {
        return JWTHelper.generateToken(jwtInfo, keyConfiguration.getUserPriKey(),expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, keyConfiguration.getUserPubKey());
    }
}
