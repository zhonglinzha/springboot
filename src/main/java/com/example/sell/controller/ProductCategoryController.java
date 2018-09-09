package com.example.sell.controller;

import com.example.sell.entity.ProductCategory;
import com.example.sell.service.ProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/insertPC")
    public String insertPC(ProductCategory productCategory){
        productCategory.setCreateTime(new Date());
        log.debug("----{}---",productCategory.toString());
        Integer it = productCategoryService.insertPC(productCategory);
      return "ooo";
    }

    @GetMapping("/deletePC/{id}")
    public String deletePC(@PathVariable("id") String category_id){
        productCategoryService.deletePC(category_id);
        return "1";
    }

    @PostMapping("/getPCs")
    public List<ProductCategory> getPCs(){
        return productCategoryService.getProductCategorys();
    }

    @PostMapping("/getPC")
    public ProductCategory getPc(@RequestParam("categoryId") String cid){
        ProductCategory pc = productCategoryService.getProductCategory(cid);
        return pc;
    }

    @PostMapping("updatePC")
    public Integer updatePC(ProductCategory pc){

        pc.setCreateTime(new Date());
       return productCategoryService.updateProductCategory(pc);

    }
}
