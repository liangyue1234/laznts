package com.laznts.page;

import com.laznts.base.DriverBase;
import com.laznts.entity.User_login;
import com.laznts.util.DataBaseUtil;
import com.laznts.util.getByLocator;
import org.apache.ibatis.session.SqlSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/23.
 */
public class LoginPage extends BasePage {
 public LoginPage(DriverBase driver){

    super(driver);
 }
    /**
     * 获取用户名输入框
     */
    public WebElement getUserElement(){

        return    element(getByLocator.getLocator("username"));
    }
    /**
     * 获取密码输入框
     */
    public WebElement getPassword(){

        return element(getByLocator.getLocator("password"));
    }
    /**
     * 获取登录按钮
     */
    public WebElement getLoginButton(){

        return  element(getByLocator.getLocator("loginbutton"));
    }
    /**
     * 登录提交按钮
     */
    public WebElement getButton(){
        return  element(getByLocator.getLocator("button"));
    }
}
