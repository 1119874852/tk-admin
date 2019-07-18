package com.tk.common.exception;

import com.tk.auth.common.constant.CommonConstant;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:31
 */
public class ClientTokenException extends BaseException{
    public ClientTokenException(String message) {
        super(message, CommonConstant.EX_CLIENT_INVALID_CODE);
    }
}
