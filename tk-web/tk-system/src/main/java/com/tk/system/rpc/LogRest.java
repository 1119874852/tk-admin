package com.tk.system.rpc;

import com.tk.api.vo.log.LogInfo;
import com.tk.system.biz.GateLogBiz;
import com.tk.system.entity.GateLog;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-15:18
 */
@RequestMapping("api")
@RestController
public class LogRest {
    @Autowired
    private GateLogBiz gateLogBiz;
    @RequestMapping(value="/log/save",method = RequestMethod.POST)
    public @ResponseBody
    void saveLog(@RequestBody LogInfo info){
        GateLog log = new GateLog();
        BeanUtils.copyProperties(info,log);
        gateLogBiz.insertSelective(log);
    }
}
