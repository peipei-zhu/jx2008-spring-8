package com.cykj.jx2008spring8.mapper;


import com.cykj.jx2008spring8.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectUserList();
    public void insertUser(@Param("id")  int id, @Param("name")String name, @Param("age") int age);
   void insertt(User user);
}
