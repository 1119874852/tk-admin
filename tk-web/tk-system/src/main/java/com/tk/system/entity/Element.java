package com.tk.system.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:27
 */
@Data
@Table(name = "base_element")
public class Element {
    @Id
    private Integer id;

    private String code;

    private String type;

    private String name;

    private String uri;

    @Column(name = "menu_id")
    private String menuId;

    @Column(name = "parent_id")
    private String parentId;

    private String path;

    private String method;

    private String description;

    @Column(name = "crt_time")
    private Date crtTime;

    @Column(name = "crt_user")
    private String crtUser;

    @Column(name = "crt_name")
    private String crtName;

    @Column(name = "crt_host")
    private String crtHost;

    private String attr1;

    private String attr2;

    private String attr3;

    private String attr4;

    private String attr5;

    private String attr6;

    private String attr7;

    private String attr8;
}
