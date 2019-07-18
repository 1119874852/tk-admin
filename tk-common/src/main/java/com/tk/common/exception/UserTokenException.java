package com.tk.common.exception;

import com.tk.auth.common.constant.CommonConstant;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:28
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstant.EX_USER_INVALID_CODE);
    }
}
