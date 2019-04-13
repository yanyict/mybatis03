package com.sc.dao;

import java.util.List;

import com.sc.po.ItemBean;

public interface ItemBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemBean record);

    int insertSelective(ItemBean record);

    ItemBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemBean record);

    int updateByPrimaryKey(ItemBean record);
    
    List<ItemBean> selectAllItem();
}