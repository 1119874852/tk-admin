package com.tk.api.vo.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-13:48
 */
@Data
public class UserInfo implements Serializable {
    public String id;
    public String username;
    public String password;
    public String name;
    private String description;
}
