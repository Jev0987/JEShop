package cn.JEvin.service;

import cn.JEvin.common.pojo.EasyUIDataGridResult;
import cn.JEvin.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page,int rows);
}
