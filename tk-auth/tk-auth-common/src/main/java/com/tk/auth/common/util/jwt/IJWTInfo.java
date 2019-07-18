package com.tk.auth.common.util.jwt;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-16:21
 */
public interface IJWTInfo {
    /**
     * 获取用户名
     * @return
     */
    String getUniqueName();

    /**
     * 获取用户ID
     * @return
     */
    String getId();

    /**
     * 获取名称
     * @return
     */
    String getName();
}
