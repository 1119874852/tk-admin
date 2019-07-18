package com.tk.auth.service.bean;

import com.tk.auth.common.util.jwt.IJWTInfo;
import lombok.Data;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:47
 */
@Data
public class ClientInfo implements IJWTInfo {
    String clientId;
    String name;
    String id;

    public ClientInfo(String clientId, String name, String id) {
        this.clientId = clientId;
        this.name = name;
        this.id = id;
    }

    @Override
    public String getUniqueName() {
        return clientId;
    }
}
