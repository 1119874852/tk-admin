package com.tk.auth.service.controller;

import com.tk.auth.service.biz.ClientBiz;
import com.tk.auth.service.entity.Client;
import com.tk.auth.service.entity.ClientService;
import com.tk.common.controlle.BaseController;
import com.tk.common.msg.ObjectRestResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-16:09
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz, Client> {
    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
