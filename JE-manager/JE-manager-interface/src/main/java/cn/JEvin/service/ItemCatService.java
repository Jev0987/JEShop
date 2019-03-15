package cn.JEvin.service;

import java.util.List;

import cn.JEvin.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getItemCatlist(long parentId);
}
