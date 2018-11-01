package com.laznts.page;

import com.laznts.base.DriverBase;
import com.laznts.util.getByLocator;
import org.openqa.selenium.WebElement;

/**
 * Created by liang on 2018/9/11.
 */
public class RegisterPage extends BasePage {
    public RegisterPage(DriverBase driverBase) {

        super(driverBase);
    }
    /**
     * 点击注册按钮
     */
    public WebElement registerName(){
        return element(getByLocator.getLocator("lll"));
    }
    /**
     *输入用户名
     */
    public WebElement putName(){
        return element(getByLocator.getLocator("user_input"));
    }
    /**
     * 输入密码
     */
    public WebElement putPwd(){

        return element(getByLocator.getLocator("pwd_input"));
    }
    /**
     * 输入确认密码
     */
    public WebElement establishedPwd(){
        return element(getByLocator.getLocator("pwd_input2"));
    }
    /**
     * 输入所在法院
     */
    public WebElement locationFy(){
        return element(getByLocator.getLocator("szfy"));
    }
    /**
     * 点击注册按钮
     */
    public WebElement  clickRegisterButton(){

     return element(getByLocator.getLocator("registerbutton"));
    }

}
