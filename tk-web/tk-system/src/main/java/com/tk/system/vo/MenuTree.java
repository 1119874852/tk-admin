package com.tk.system.vo;

import com.tk.common.vo.TreeNode;
import lombok.Data;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:34
 */
@Data
public class MenuTree extends TreeNode {
    String icon;
    String title;
    String href;
    boolean spread = false;
    String path;
    String component;
    String authority;
    String redirect;
    String code;
    String label;
    public MenuTree() {
    }

    public MenuTree(int id, String name, int parentId) {
        this.id = id;
        this.parentId = parentId;
        this.title = name;
        this.label = name;
    }
    public MenuTree(int id, String name, MenuTree parent) {
        this.id = id;
        this.parentId = parent.getId();
        this.title = name;
        this.label = name;
    }
}
