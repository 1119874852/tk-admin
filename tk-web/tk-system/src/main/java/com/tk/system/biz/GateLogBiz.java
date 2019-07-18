package com.tk.system.biz;

import com.tk.common.biz.BaseBiz;
import com.tk.system.entity.GateLog;
import com.tk.system.mapper.GateLogMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-15:19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GateLogBiz extends BaseBiz<GateLogMapper, GateLog> {
    @Override
    public void insert(GateLog entity) {
        mapper.insert(entity);
    }

    @Override
    public void insertSelective(GateLog entity) {
        mapper.insertSelective(entity);
    }
}
