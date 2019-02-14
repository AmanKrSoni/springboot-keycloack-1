package com.cvt.springbootkeycloak1.dao;

import com.cvt.springbootkeycloak1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    static List<User> userList;

    static {
        userList=new ArrayList<>();
        userList.add(new User("Aman","aman"));
        userList.add(new User("Ram","rim"));
        userList.add(new User("Shyam","shipp"));
    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
