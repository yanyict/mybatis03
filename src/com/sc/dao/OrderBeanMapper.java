package com.sc.dao;

import com.sc.po.OrderBean;

public interface OrderBeanMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderBean record);

    int insertSelective(OrderBean record);

    OrderBean selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderBean record);

    int updateByPrimaryKey(OrderBean record);
}