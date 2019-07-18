package com.tk.common.exception;

import com.tk.auth.common.constant.CommonConstant;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:48
 */
public class ClientInvalidException extends BaseException{
    public ClientInvalidException(String message) {
        super(message, CommonConstant.EX_CLIENT_INVALID_CODE);
    }
}
