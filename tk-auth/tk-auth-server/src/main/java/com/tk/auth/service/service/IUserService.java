package com.tk.auth.service.service;

import com.tk.api.vo.user.UserInfo;
import com.tk.auth.service.config.FeignConfiguration;
import com.tk.auth.service.util.JwtAuthenticationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-11:08
 */
@FeignClient(value = "tk-system",configuration = FeignConfiguration.class)
public interface IUserService {
    @RequestMapping(value = "/api/user/validate", method = RequestMethod.POST)
    public UserInfo validate(@RequestBody JwtAuthenticationRequest authenticationRequest);
}
