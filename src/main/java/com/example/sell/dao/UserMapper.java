package com.example.sell.dao;

import com.example.sell.entity.Book;
import com.example.sell.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    Integer insertUser(User user);

    Integer updateUser(@Param("userId") Integer userId, @Param("userName") String userName, @Param("userPass") String userPass, @Param("userPhone") String userPhone, @Param("userAdd") String userAdd);

    Integer deleteUser(@Param("userId") Integer userId, @Param("userName") String userName);

    User getUser(Integer userId);

    User getUserByMap(Map<String,Object> map);

    User getUserByNameOrPass(@Param("userName") String userName, @Param("userPass") String userPass);

    List<User> getUsers();

    User getUserAndBooks(Integer userid);



}
