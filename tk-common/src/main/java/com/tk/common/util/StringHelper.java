package com.tk.common.util;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-17:55
 */
public class StringHelper {
    public static String getObjectValue(Object obj){
        return obj==null?"":obj.toString();
    }
}
