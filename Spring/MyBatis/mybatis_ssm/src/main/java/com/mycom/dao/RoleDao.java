package com.mycom.dao;

import com.mycom.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleDao {

     List<Role> findAll();

     Role findById(@Param(value="id")Long id);

     List<Role> findByIds(Map params);

     List<Role> findByIds(int[] ints);

}
