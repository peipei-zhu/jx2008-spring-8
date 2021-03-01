package com.cykj.jx2008spring8.service;


import com.cykj.jx2008spring8.entity.User;

import java.util.List;

public interface AdminService {

    List<User> selectUserList();
    public void insert(int id, String name, int age);
    void insertUser(User user);

}
