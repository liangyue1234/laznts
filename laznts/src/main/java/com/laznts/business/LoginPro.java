package com.laznts.business;

import com.laznts.base.DriverBase;
import com.laznts.handle.LoginPageHandle;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/23.
 */
public class LoginPro {
    public LoginPageHandle lph;
    public LoginPro(DriverBase driver){
        lph =new LoginPageHandle(driver);
    }
    public void login(String username,String password) throws IOException {

         if(lph.assertLoginPage()) {
             lph.clickLoginButton();
             lph.sendKeysUser(username);
             lph.sendKeysPassword(password);
             lph.clickButton();
         }else {
             System.out.println("页面不存在或者状态不正确");
         }
    }
}
