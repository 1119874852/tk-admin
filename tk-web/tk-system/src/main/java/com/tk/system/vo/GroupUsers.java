package com.tk.system.vo;

import com.tk.system.entity.User;
import lombok.Data;

import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-15:05
 */
@Data
public class GroupUsers {
    List<User> members ;
    List<User> leaders;

    public GroupUsers() {
    }

    public GroupUsers(List<User> members, List<User> leaders) {
        this.members = members;
        this.leaders = leaders;
    }
}
