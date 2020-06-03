package com.mycom.dao;

import com.mycom.domain.User;

public interface UserDao {
    User findById(int id);
}
