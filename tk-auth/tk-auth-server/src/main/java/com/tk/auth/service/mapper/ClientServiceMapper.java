package com.tk.auth.service.mapper;

import com.tk.auth.service.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:12
 */
public interface ClientServiceMapper extends Mapper<ClientService> {
    void deleteByServiceId(int id);
}
