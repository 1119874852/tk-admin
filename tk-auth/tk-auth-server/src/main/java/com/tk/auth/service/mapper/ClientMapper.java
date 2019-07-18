package com.tk.auth.service.mapper;

import com.tk.auth.service.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:11
 */
public interface ClientMapper extends Mapper<Client> {
    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);
}
