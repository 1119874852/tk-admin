package com.tk.system.biz;

import com.ace.cache.annotation.Cache;
import com.ace.cache.annotation.CacheClear;
import com.tk.common.biz.BaseBiz;
import com.tk.system.entity.Element;
import com.tk.system.mapper.ElementMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ElementBiz extends BaseBiz<ElementMapper, Element> {
    @Cache(key="permission:ele:u{1}")
    public List<Element> getAuthorityElementByUserId(String userId){
        return mapper.selectAuthorityElementByUserId(userId);
    }
    public List<Element> getAuthorityElementByUserId(String userId,String menuId){
        return mapper.selectAuthorityMenuElementByUserId(userId,menuId);
    }

    @Cache(key="permission:ele")
    public List<Element> getAllElementPermissions(){
        return mapper.selectAllElementPermissions();
    }

    @Override
    @CacheClear(keys={"permission:ele","permission"})
    public void insertSelective(Element entity) {
        super.insertSelective(entity);
    }

    @Override
    @CacheClear(keys={"permission:ele","permission"})
    public void updateSelectiveById(Element entity) {
        super.updateSelectiveById(entity);
    }
}
