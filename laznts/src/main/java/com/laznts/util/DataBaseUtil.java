package com.laznts.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by liang on 2018/10/29.
 */
public class DataBaseUtil {
  public static SqlSession getsqlSession() throws IOException {
      Reader reader= Resources.getResourceAsReader("Mybatis-Config.xml");
      SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
      SqlSession sqlSession=sqlSessionFactory.openSession();

      return sqlSession;
  }

}
