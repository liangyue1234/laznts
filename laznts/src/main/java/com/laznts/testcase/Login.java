package com.laznts.testcase;

import com.laznts.base.DriverBase;
import com.laznts.business.LoginPro;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        driver.get("http://124.205.50.166:8082/caa_v3.0/jsp/index.html");
        Thread.sleep(3000);
       }
       @Test
   public void testLogin(){
        loginPro.login("liangyue","liangyue1");
        logger.info("登录日志");
   }

}
