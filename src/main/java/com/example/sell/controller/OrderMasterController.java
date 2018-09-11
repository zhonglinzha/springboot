package com.example.sell.controller;

import com.example.sell.entity.OrderMaster;
import com.example.sell.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class OrderMasterController {

    @Autowired
    OrderMasterService orderMasterService;


    @PostMapping("/insertOrderInfo")
    public Integer insertOrderInfo(OrderMaster om){
        om.setCreateTime(new Date());
        return orderMasterService.insertOrderInfo(om);
    }

    @PostMapping("/updateOrderInfo")
    public Integer updateOrderInfo(OrderMaster om){
        om.setCreateTime(new Date());
        return orderMasterService.updateOrderInfo(om);

    }
    @PostMapping("/deleteOrderInfo/{orderId}")
    public Integer deleteOrderInfo(@PathVariable String orderId){
        return orderMasterService.deleteOrderInfo(orderId);

    }

    @PostMapping("/getOM/{orderId}")
    public OrderMaster getOM(@PathVariable String orderId){
        return orderMasterService.getOM(orderId);

    }

    @PostMapping("/getOMs")
    public List<OrderMaster> getOMs(){
        return orderMasterService.getOMs();

    }
}
