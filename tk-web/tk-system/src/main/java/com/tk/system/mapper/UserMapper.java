package com.tk.system.mapper;

import com.tk.system.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:17
 */
public interface UserMapper extends Mapper<User> {
    List<User> selectMemberByGroupId(@Param("groupId") int groupId);

    List<User> selectLeaderByGroupId(@Param("groupId") int groupId);
}
