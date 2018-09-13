package com.example.sell.service;

import com.example.sell.dao.UserMapper;
import com.example.sell.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Integer insertUser(User user){


                userMapper.insertUser(user);

        log.debug("-----------{}----------",user.getUserId());
        return 1;
    }

    public Integer updateUser(Integer userId, String userName, String userPass, String userPhone, String userAddress){
        return userMapper.updateUser(userId, userName, userPass, userPhone, userAddress);
    }

    public Integer deleteUser(Integer userId, String userName){
        return userMapper.deleteUser(userId,userName);
    }

//    User getUser(Integer userId){
//
//    }
//
//    User getUserByMap(Map<String,Object> map){
//
//    }
//
//    User getUserByNameOrPass(@Param("userName") String userName, @Param("userPass") String userPass){
//
//    }
//
//    List<User> getUsers(){
//
//    }
//
    public User getUserAndBooks(Integer userid){
        return userMapper.getUserAndBooks(userid);
    }
}
