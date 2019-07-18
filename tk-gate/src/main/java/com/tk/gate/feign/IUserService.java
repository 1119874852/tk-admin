package com.tk.gate.feign;

import com.tk.api.vo.authority.PermissionInfo;
import com.tk.gate.fallback.UserServiceFallback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:15
 */
@FeignClient(value = "tk-system",fallback = UserServiceFallback.class)
public interface IUserService{
    @RequestMapping(value="/api/user/un/{username}/permissions",method = RequestMethod.GET)
    List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username);

    @RequestMapping(value="/api/permissions",method = RequestMethod.GET)
    List<PermissionInfo> getAllPermissionInfo();
}
