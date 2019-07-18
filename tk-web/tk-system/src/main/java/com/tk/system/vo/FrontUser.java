package com.tk.system.vo;

import com.tk.api.vo.authority.PermissionInfo;
import lombok.Data;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:37
 */
@Data
public class FrontUser {
    public String id;
    public String username;
    public String name;
    private String description;
    private String image;
    private List<PermissionInfo> menus;
    private List<PermissionInfo> elements;
}
