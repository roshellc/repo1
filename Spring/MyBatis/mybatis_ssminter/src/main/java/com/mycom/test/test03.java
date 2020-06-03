package com.mycom.test;

import com.mycom.dao.RoleDao;
import com.mycom.dao.UserDao;
import com.mycom.domain.Role;
import com.mycom.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test03 {
    //动态sql之if
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();


        RoleDao mapper = sqlSession.getMapper(RoleDao.class);



        Role byId = mapper.findById(1L);

        System.out.println(byId);
    }

    @Test
    public void test00() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();


        UserDao mapper = sqlSession.getMapper(UserDao.class);



        User byId = mapper.findById(1);

        System.out.println(byId);
    }

    //动态sql之foreach
    @Test
    public void test01() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();
        RoleDao mapper = sqlSession.getMapper(RoleDao.class);

        final List ids = new ArrayList();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        Map params = new HashMap();
        params.put("shi", ids);
        //params.put("title", "中国");

        List<Role> byIds = mapper.findByIds(params);

        for (Role role : byIds)
            System.out.println(role);
        sqlSession.close();
    }

    //自定义TypeHandler
    @Test
    public void test02(){


    }
}
