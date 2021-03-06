package com.example.sell.dao;

import com.example.sell.entity.OrderMaster;

import java.util.List;

public interface OrderMasterMapper {

    Integer insertOrderInfo(OrderMaster om);

    Integer updateOrderInfo(OrderMaster om);

    Integer deleteOrderInfo(String orderId);

    OrderMaster getOM(String orderId);

    List<OrderMaster> getOMs();
}
