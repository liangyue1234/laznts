package com.laznts.testcase;

import com.laznts.base.DriverBase;
import com.laznts.business.RegisterPro;
import com.laznts.entity.User_register;
import com.laznts.util.DataBaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by liang on 2018/11/1.
 */
public class Register  extends  CaseBase{

        public DriverBase driverBase;
        public RegisterPro registerPro;
        public Register(){
            this.driverBase= InitDriver("chrome");
            registerPro=new RegisterPro(driverBase);
        }
        @BeforeMethod
        public void  getLoginHome() throws InterruptedException {
            driverBase.get("http://124.205.50.166:8082/caa_v3.0/jsp/index.html");
            driverBase.sizeWindow();
            Thread.sleep(3000);
        }
        @Test
        public void testRegister() throws IOException {
            SqlSession sqlSession= DataBaseUtil.getsqlSession();
            User_register user_register=sqlSession.selectOne("register",1);
            registerPro.register(user_register.getUsername(),user_register.getPassword(),user_register.getConfirm_password(),user_register.getLaw());
        }
        @AfterMethod
        public void closeRegister(){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driverBase.close();
        }
    }

