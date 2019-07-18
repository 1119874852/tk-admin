package com.tk.auth.service.biz;

import com.tk.auth.service.entity.Client;
import com.tk.auth.service.entity.ClientService;
import com.tk.auth.service.mapper.ClientMapper;
import com.tk.auth.service.mapper.ClientServiceMapper;
import com.tk.common.biz.BaseBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:11
 */
@Service
public class ClientBiz extends BaseBiz<ClientMapper, Client> {
    @Autowired
    private ClientServiceMapper clientServiceMapper;
    @Autowired
    private ClientServiceBiz clientServiceBiz;

    public List<Client> getClientServices(int id) {
        return mapper.selectAuthorityServiceInfo(id);
    }

    public void modifyClientServices(int id, String clients) {
        clientServiceMapper.deleteByServiceId(id);
        if (!StringUtils.isEmpty(clients)) {
            String[] mem = clients.split(",");
            for (String m : mem) {
                ClientService clientService = new ClientService();
                clientService.setServiceId(m);
                clientService.setClientId(id+"");
                clientServiceBiz.insertSelective(clientService);
            }
        }
    }
}
