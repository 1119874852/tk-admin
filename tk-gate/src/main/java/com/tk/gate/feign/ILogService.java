package com.tk.gate.feign;

import com.tk.api.vo.log.LogInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-18:15
 */
@FeignClient("tk-system")
public interface ILogService {
    @RequestMapping(value="/api/log/save",method = RequestMethod.POST)
    void saveLog(LogInfo info);
}
