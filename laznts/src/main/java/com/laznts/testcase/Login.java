package com.laznts.testcase;

import com.laznts.base.DriverBase;
import com.laznts.business.LoginPro;
import com.laznts.entity.User_login;
import com.laznts.util.DataBaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/23.
 */
public class Login extends CaseBase{
   public static Logger logger= Logger.getLogger(Login.class);
    public DriverBase driver;
    public LoginPro loginPro;
    public Login(){
      this.driver=  InitDriver("chrome");
      loginPro=new LoginPro(driver);

    }
      @BeforeMethod
       public void  getLoginHome() throws InterruptedException {
        driver.get("http://192.168.10.111:8084/caa_v3.0/jsp/index.html");
        driver.sizeWindow();
        Thread.sleep(3000);
       }
       @Test
   public void testLogin() throws IOException {
           loginPro.login();


        logger.info("登录日志");
   }
   @AfterMethod
    public void closeLogin(){
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       driver.close();
   }

}
