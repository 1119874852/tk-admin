package com.tk.system.biz;

import com.tk.common.biz.BaseBiz;
import com.tk.system.entity.GroupType;
import com.tk.system.mapper.GroupTypeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-15:36
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper, GroupType> {
}
