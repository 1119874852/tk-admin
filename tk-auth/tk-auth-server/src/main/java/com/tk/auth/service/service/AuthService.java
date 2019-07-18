package com.tk.auth.service.service;


import com.tk.auth.service.util.JwtAuthenticationRequest;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-10:58
 */
public interface AuthService {
    String login(JwtAuthenticationRequest authenticationRequest) throws Exception;

    String refresh(String oldToken) throws Exception;

    void validate(String token) throws Exception;
}
