package com.tk.api.vo.authority;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:20
 */
@Data
public class PermissionInfo implements Serializable {
    private String code;
    private String type;
    private String uri;
    private String method;
    private String name;
    private String menu;
}
