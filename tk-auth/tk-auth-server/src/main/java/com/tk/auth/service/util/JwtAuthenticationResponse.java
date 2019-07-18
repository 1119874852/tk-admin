package com.tk.auth.service.util;

import java.io.Serializable;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-11:04
 */
public class JwtAuthenticationResponse implements Serializable {
    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
