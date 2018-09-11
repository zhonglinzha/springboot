package com.example.sell.service;

import com.example.sell.dao.OrderDetailMapper;
import com.example.sell.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    OrderDetailMapper orderDeatilMapper;

    public Integer insertOD(OrderDetail od){
        return orderDeatilMapper.insertOD(od);
    }

    public Integer updateOD(OrderDetail od){
        return orderDeatilMapper.updateOD(od);

    }

    public Integer deleteOD(String detailId){
        return orderDeatilMapper.deleteOD(detailId);

    }

    public OrderDetail getOD(String detailId){
        return orderDeatilMapper.getOD(detailId);

    }

    public List<OrderDetail> getODs(){
        return orderDeatilMapper.getODs();

    }

}
