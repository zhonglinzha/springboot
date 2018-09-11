package com.example.sell.controller;

import com.example.sell.entity.OrderDetail;
import com.example.sell.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class OrderDetailController {

    @Autowired
    public OrderDetailService orderDetailService;


    @PostMapping("/insertOD")
    public Integer insertOD(OrderDetail od){
        od.setCreateTime(new Date());
        return orderDetailService.insertOD(od);
    }

    @PostMapping("/updateOD")
    public Integer updateOD(OrderDetail od){
        od.setCreateTime(new Date());
        return orderDetailService.updateOD(od);

    }

    @GetMapping("/deleteOD/{detailId}")
    public Integer deleteOD(@PathVariable("detailId") String detailId){
        return orderDetailService.deleteOD(detailId);

    }

    @GetMapping("/getOD/{detailId}")
    public OrderDetail getOD(@PathVariable("detailId") String detailId){
        return orderDetailService.getOD(detailId);

    }

    @GetMapping("/getODs")
    public List<OrderDetail> getODs(){
        return orderDetailService.getODs();

    }
}
