package com.tk.system.controller;

import com.tk.common.controlle.BaseController;
import com.tk.system.biz.GroupTypeBiz;
import com.tk.system.entity.GroupType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-15:36
 */
@Controller
@RequestMapping("groupType")
public class GroupTypeController extends BaseController<GroupTypeBiz, GroupType> {
    //
//    @RequestMapping(value = "/page",method = RequestMethod.GET)
//    @ResponseBody
//    public TableResultResponse<Object> page(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1")int page, String name){
//        Example example = new Example(GroupType.class);
//        if(StringUtils.isNotBlank(name))
//            example.createCriteria().andLike("name", "%" + name + "%");
//        Page<Object> result = PageHelper.startPage(page, limit);
//        baseBiz.selectByExample(example);
//        return new TableResultResponse<Object>(result.getTotal(),result.getResult());
//    }
}
