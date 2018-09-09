package com.example.sell.dao;

import com.example.sell.entity.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductCategoryMapper {

    @Insert("insert into product_category (category_id,category_name,category_type,create_time) " +
            "values ( #{categoryId}, #{categoryName}, #{categoryType}, #{createTime})")
    Integer insertProductCategory(ProductCategory pc);

    @Delete("delete from product_category where category_id = #{category_id} ")
    Integer deleteProductCategory(String category_id);

    @Update("update product_category set category_name=#{categoryName}, category_type=#{categoryType}," +
            "create_time=#{createTime} where category_id=#{categoryId}")
    Integer updateProductCategory(ProductCategory pc);


    @Select("select * from product_category")
    @Results({@Result(property="categoryId",column="category_id")
            ,@Result(property="categoryName",column="category_name")
            ,@Result(property="categoryType",column="category_type")
            ,@Result(property="createTime",column="create_time")
    })
    List<ProductCategory> getProductCategorys();

    @Select("select category_id as categoryId, category_name as categoryName, category_type as categoryType, create_time as createTime  from product_category where category_id= #{categoryId}")
    ProductCategory getProductCategory(String categoryId);


}
