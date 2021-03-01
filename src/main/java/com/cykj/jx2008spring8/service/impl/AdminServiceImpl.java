package com.cykj.jx2008spring8.service.impl;


import com.cykj.jx2008spring8.entity.User;
import com.cykj.jx2008spring8.mapper.UserMapper;
import com.cykj.jx2008spring8.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

   @Autowired
   private UserMapper userMapper;

    @Override
    @Transactional
    public List<User> selectUserList() {
        User user =new User();
        user.setId(10);
        user.setName("李宁");
        user.setAge(18);
//        userMapper.insertUser(user);


        return userMapper.selectUserList();
    }

    @Override
    @Transactional
    public void insert(int id, String name, int age) {
        userMapper.insertUser(id, name, age);
    }

    @Override
    public void insertUser(User user) {
        User user2 =new User();
        user.setId(10);
        user.setName("李宁");
        user.setAge(18);
        userMapper.insertt(user2);

    }


}
