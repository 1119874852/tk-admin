package com.tk.common.msg;

import com.tk.common.context.RestCodeConstants;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:34
 */
public class TokenForbiddenResponse extends BaseResponse{
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
