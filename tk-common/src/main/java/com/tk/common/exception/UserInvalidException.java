package com.tk.common.exception;


import com.tk.auth.common.constant.CommonConstant;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-11:20
 */
public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstant.EX_USER_PASS_INVALID_CODE);
    }
}
