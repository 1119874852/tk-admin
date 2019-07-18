package com.tk.common.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-14:34
 */
@Data
public class TreeNode {
    protected int id;
    protected int parentId;
    List<TreeNode> children = new ArrayList<TreeNode>();
    public void add(TreeNode node){
        children.add(node);
    }
}
