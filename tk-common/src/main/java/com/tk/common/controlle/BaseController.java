package com.tk.common.controlle;

import com.tk.common.biz.BaseBiz;
import com.tk.common.context.BaseContextHandler;
import com.tk.common.msg.ObjectRestResponse;
import com.tk.common.msg.TableResultResponse;
import com.tk.common.util.QueryUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:20
 */
@Slf4j
public class BaseController<Biz extends BaseBiz,Entity>  {
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Biz baseBiz;

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<Entity> add(@RequestBody Entity entity){
        baseBiz.insertSelective(entity);
        return new ObjectRestResponse<Entity>();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        ObjectRestResponse<Entity> entityObjectRestResponse = new ObjectRestResponse<>();
        Object o = baseBiz.selectById(id);
        entityObjectRestResponse.data((Entity)o);
        return entityObjectRestResponse;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse<Entity> update(@RequestBody Entity entity){
        baseBiz.updateSelectiveById(entity);
        return new ObjectRestResponse<Entity>();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse<Entity> remove(@PathVariable int id){
        baseBiz.deleteById(id);
        return new ObjectRestResponse<Entity>();
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Entity> all(){
        return baseBiz.selectListAll();
    }
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Entity> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        QueryUtils query = new QueryUtils(params);
        return baseBiz.selectByQuery(query);
    }
    public String getCurrentUserName(){
        return BaseContextHandler.getUsername();
    }
}
