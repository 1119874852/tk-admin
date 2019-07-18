package com.tk.system.mapper;

import com.tk.system.entity.Element;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:28
 */
public interface ElementMapper extends Mapper<Element> {
    List<Element> selectAuthorityElementByUserId(@Param("userId") String userId);

    List<Element> selectAuthorityMenuElementByUserId(@Param("userId") String userId, @Param("menuId") String menuId);

    List<Element> selectAuthorityElementByClientId(@Param("clientId") String clientId);

    List<Element> selectAllElementPermissions();
}
