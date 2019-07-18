package com.tk.api.vo.log;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:23
 */
@Data
public class LogInfo implements Serializable {
    private String menu;
    private String opt;
    private String uri;
    private Date crtTime;
    private String crtUser;
    private String crtName;
    private String crtHost;
    public LogInfo(String menu, String option, String uri,  Date crtTime, String crtUser, String crtName, String crtHost) {
        this.menu = menu;
        this.opt = option;
        this.uri = uri;
        this.crtTime = crtTime;
        this.crtUser = crtUser;
        this.crtName = crtName;
        this.crtHost = crtHost;
    }
    public LogInfo() {
    }
}
