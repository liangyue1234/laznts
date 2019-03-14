package com.laznts.business;

import com.laznts.base.DriverBase;
import com.laznts.entity.User_login;
import com.laznts.handle.LoginPageHandle;
import com.laznts.util.DataBaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/23.
 */
public class  LoginPro {
    public LoginPageHandle lph;
   // public User_login user_login;
    public LoginPro(DriverBase driver){
        lph =new LoginPageHandle(driver);
    }
    public void login() throws IOException {
        SqlSession sqlSession= DataBaseUtil.getsqlSession();
        User_login user= sqlSession.selectOne("login",3);

         if(lph.assertLoginPage()) {
             lph.clickLoginButton();
             lph.sendKeysUser(user.getUsername());
             lph.sendKeysPassword(user.getPassword());
             lph.clickButton();
          //   lph.assertUserName();
             //System.out.println(lph.assertUserName());
          //   Assert.assertEquals(lph.assertUserName(),user.getUsername());
         }else {
             System.out.println("页面不存在或者状态不正确");
         }
    }
}
