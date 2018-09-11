package com.example.sell.dao;

import com.example.sell.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {

    Integer insertOD(OrderDetail od);

    Integer updateOD(OrderDetail od);

    Integer deleteOD(String detailId);

    OrderDetail getOD(String detailId);

    List<OrderDetail> getODs();

}
