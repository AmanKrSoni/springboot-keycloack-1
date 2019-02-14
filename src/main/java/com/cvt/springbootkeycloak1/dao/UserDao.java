package com.cvt.springbootkeycloak1.dao;

import com.cvt.springbootkeycloak1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();

}
