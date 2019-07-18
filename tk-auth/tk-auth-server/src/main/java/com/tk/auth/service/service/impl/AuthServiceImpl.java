package com.tk.auth.service.service.impl;


import com.tk.api.vo.user.UserInfo;
import com.tk.auth.common.util.jwt.JWTInfo;
import com.tk.auth.service.service.AuthService;
import com.tk.auth.service.service.IUserService;
import com.tk.auth.service.util.JwtAuthenticationRequest;
import com.tk.auth.service.util.JwtTokenUtil;
import com.tk.common.exception.UserInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-10:59
 */
@Service
public class AuthServiceImpl  implements AuthService {

    private JwtTokenUtil jwtTokenUtil;
    private IUserService userService;

    @Autowired
    public AuthServiceImpl(JwtTokenUtil jwtTokenUtil, IUserService userService) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.userService = userService;
    }

    @Override
    public String login(JwtAuthenticationRequest authenticationRequest) throws Exception {
        UserInfo info = userService.validate(authenticationRequest);
        if (!StringUtils.isEmpty(info.getId())) {
            return jwtTokenUtil.generateToken(new JWTInfo(info.getUsername(), info.getId() + "", info.getName()));
        }
        throw new UserInvalidException("用户不存在或账户密码错误!");
    }

    @Override
    public String refresh(String oldToken) throws Exception {
        return jwtTokenUtil.generateToken(jwtTokenUtil.getInfoFromToken(oldToken));
    }

    @Override
    public void validate(String token) throws Exception {
        jwtTokenUtil.getInfoFromToken(token);
    }
}
