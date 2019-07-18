package com.tk.system.mapper;

import com.tk.system.entity.Group;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:51
 */
public interface GroupMapper extends Mapper<Group> {
    void deleteGroupMembersById(@Param("groupId") int groupId);
    void deleteGroupLeadersById(@Param("groupId") int groupId);
    void insertGroupMembersById(@Param("groupId") int groupId, @Param("userId") int userId);
    void insertGroupLeadersById(@Param("groupId") int groupId, @Param("userId") int userId);
}
