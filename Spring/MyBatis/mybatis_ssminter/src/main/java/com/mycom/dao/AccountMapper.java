package com.mycom.dao;

import com.mycom.domain.Account;

import java.util.List;

public interface AccountMapper {
    //保存账户数据
    void save(Account account);
    //查询账户数据
    List<Account> findAll();
}