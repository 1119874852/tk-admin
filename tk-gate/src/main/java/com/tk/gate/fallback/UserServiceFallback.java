package com.tk.gate.fallback;

import com.tk.api.vo.authority.PermissionInfo;
import com.tk.gate.feign.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:14
 */
@Service
@Slf4j
public class UserServiceFallback implements IUserService {
    @Override
    public List<PermissionInfo> getPermissionByUsername(String username) {
        log.error("调用{}异常{}","getPermissionByUsername",username);
        return null;
    }

    @Override
    public List<PermissionInfo> getAllPermissionInfo() {
        log.error("调用{}异常","getPermissionByUsername");
        return null;
    }
}
