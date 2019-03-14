package com.laznts.handle;

import com.laznts.base.DriverBase;
import com.laznts.page.LoginPage;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/23.
 */
public class LoginPageHandle {
    public DriverBase driver;
    public LoginPage lp;
    public LoginPageHandle(DriverBase driver){
        this.driver=driver;
        lp=new LoginPage(driver);
    }
    /**
     * 点击登录按钮
     */
   public void clickLoginButton(){
       lp.click(lp.getLoginButton());
   }
    /**
     * 输入用户名
     */
    public void sendKeysUser(String username){
   lp.sendKeys(lp.getUserElement(),username);
    }
    /**
     * 输入密码
     */
    public void sendKeysPassword(String password){
        lp.sendKeys(lp.getPassword(),password);
    }
    /**
     * 点击提交
     */
    public void clickButton(){
        lp.click(lp.getButton());
    }
    /**
     * 判断是否是登录页面
     */
    public Boolean assertLoginPage(){
   return  lp.assertElement(lp.getUserElement());
    }
    /**
     * 判断登录后用户名是否正确
     */
//    public String assertUserName(){
//        return lp.getUserName();
//    }
}
