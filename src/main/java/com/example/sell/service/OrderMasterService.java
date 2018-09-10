package com.example.sell.service;

import com.example.sell.dao.OrderMasterMapper;
import com.example.sell.entity.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMasterService {

    @Autowired
    OrderMasterMapper orderMasterMapper;

    public Integer insertOrderInfo(OrderMaster om){
        return orderMasterMapper.insertOrderInfo(om);
    }

    public Integer updateOrderInfo(OrderMaster om){
        return orderMasterMapper.updateOrderInfo(om);

    }

    public Integer deleteOrderInfo(Integer orderId){
        return orderMasterMapper.deleteOrderInfo(orderId);

    }

    public OrderMaster getOM(Integer orderId){
        return orderMasterMapper.getOM(orderId);

    }

    public List<OrderMaster> getOMs(){
        return orderMasterMapper.getOMs();

    }
}
