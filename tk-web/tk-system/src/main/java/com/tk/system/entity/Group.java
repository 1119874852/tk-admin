package com.tk.system.entity;

import com.tk.system.constant.AdminCommonConstant;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:52
 */
@Data
@Table(name = "base_group")
public class Group {
    @Id
    private Integer id;

    private String code;

    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    private String path;

    private String type;

    @Column(name = "group_type")
    private Integer groupType = AdminCommonConstant.DEFAULT_GROUP_TYPE;

    private String description;

    @Column(name = "crt_time")
    private Date crtTime;

    @Column(name = "crt_user")
    private String crtUser;

    @Column(name = "crt_name")
    private String crtName;

    @Column(name = "crt_host")
    private String crtHost;

    @Column(name = "upd_time")
    private Date updTime;

    @Column(name = "upd_user")
    private String updUser;

    @Column(name = "upd_name")
    private String updName;

    @Column(name = "upd_host")
    private String updHost;

    private String attr1;

    private String attr2;

    private String attr3;

    private String attr4;

    private String attr5;

    private String attr6;

    private String attr7;

    private String attr8;
}
