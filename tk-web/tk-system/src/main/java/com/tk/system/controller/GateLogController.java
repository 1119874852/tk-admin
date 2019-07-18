package com.tk.system.controller;

import com.tk.common.controlle.BaseController;
import com.tk.system.biz.GateLogBiz;
import com.tk.system.entity.GateLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/8-13:46
 */
@Controller
@RequestMapping("gateLog")
public class GateLogController extends BaseController<GateLogBiz, GateLog> {
}
