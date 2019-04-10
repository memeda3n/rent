package cn.watson.rent.service;

import cn.watson.rent.dao.entity.User;
import cn.watson.rent.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void insert (){
        User user=new User();
        user.setId(2L);
        user.setName("asd");
        userMapper.insert(user);
    }

}
