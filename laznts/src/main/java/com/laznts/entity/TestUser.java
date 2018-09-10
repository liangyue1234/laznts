package com.laznts.entity;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionTemplate;

import java.io.InputStream;

/**
 * Created by liang on 2018/9/10.
 */
public class TestUser {
    public static  void main(String[]args) {
       SqlSessionTemplate sqlSessionTemplate = null;
       int restult=  sqlSessionTemplate.selectOne("getUser");
       System.out.println(restult);
    }
}
