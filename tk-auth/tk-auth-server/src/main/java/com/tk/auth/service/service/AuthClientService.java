package com.tk.auth.service.service;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/6-16:49
 */
public interface AuthClientService {
    public String apply(String clientId, String secret) throws Exception;

    /**
     * 获取授权的客户端列表
     * @param serviceId
     * @param secret
     * @return
     */
    public List<String> getAllowedClient(String serviceId, String secret);

    /**
     * 获取服务授权的客户端列表
     * @param serviceId
     * @return
     */
    public List<String> getAllowedClient(String serviceId);

    public void registryClient();

    public void validate(String clientId, String secret) throws Exception;
}
