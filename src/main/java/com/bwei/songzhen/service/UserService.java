package com.bwei.songzhen.service;

import com.bwei.songzhen.entity.User;
import com.bwei.songzhen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songzhen on 2017/7/28.
 * service 类
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    //注册方法
    public void addUser(User user){
        userRepository.save(user);
    }
    //登录方法
    public User loginUser(User user){
        return userRepository.findOne(user);
    }
    //查询所有信息方法
    public List<User> selectUser(){
        List<User> all = userRepository.findAll();
        return all;
    }
    //修改方法
    public void updateUser(User user){
        userRepository.updateUser(user);
    }
    //通过id查询数据
    public User selectUserId(int id){
        User oneUser = userRepository.findOne(id);
        return oneUser;
    }
}
