package com.tk.system.biz;

import com.tk.common.biz.BaseBiz;
import com.tk.system.entity.ResourceAuthority;
import com.tk.system.mapper.ResourceAuthorityMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-15:07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper, ResourceAuthority> {
}
