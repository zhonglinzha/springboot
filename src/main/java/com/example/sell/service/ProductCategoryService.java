package com.example.sell.service;


import com.example.sell.dao.ProductCategoryMapper;
import com.example.sell.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    public Integer insertPC(ProductCategory productCategory){

        return productCategoryMapper.insertProductCategory(productCategory);
    }


    public Integer deletePC(String category_id){

        return productCategoryMapper.deleteProductCategory(category_id);
    }

    public List<ProductCategory> getProductCategorys(){
        return productCategoryMapper.getProductCategorys();
    }

    public ProductCategory getProductCategory(String category_id){
        return productCategoryMapper.getProductCategory(category_id);
    }

    public Integer updateProductCategory(ProductCategory pc){

         log.debug(pc.toString());
        return productCategoryMapper.updateProductCategory(pc);
    }

}
