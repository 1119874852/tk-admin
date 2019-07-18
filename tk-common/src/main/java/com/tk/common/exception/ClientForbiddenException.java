package com.tk.common.exception;

import com.tk.auth.common.constant.CommonConstant;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:40
 */
public class ClientForbiddenException extends BaseException{
    public ClientForbiddenException(String message) {
        super(message, CommonConstant.EX_CLIENT_FORBIDDEN_CODE);
    }
}
