package com.laznts.handle;

import com.laznts.base.DriverBase;
import com.laznts.page.RegisterPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by liang on 2018/9/12.
 */
public class RegisterPageHandle {
    public DriverBase driverBase;
    public RegisterPage registerPage;
    public RegisterPageHandle(DriverBase driverBase){
             this.driverBase=driverBase;
             registerPage=new RegisterPage(driverBase);
    }
    /**
     * 点击注册按钮
     */
    public void clickRegister(){
       registerPage.click(registerPage.registerName());
    }
    /**
     * 输入用户名
     */
    public void inputName(String name){
         registerPage.sendKeys(registerPage.putName(),name);
    }
    /**
     * 输入密码
     */
    public void inputPwd(String pwd1){
      registerPage.sendKeys(registerPage.putPwd(),pwd1);
    }
    /**
     * 确认密码
     */
    public void   establishedPwd2(String pwd2){
          registerPage.sendKeys(registerPage.establishedPwd(),pwd2);
    }
    /**
     * 输入所在法院
     */
    public void szFy(String fy){
            registerPage.sendKeys(registerPage.locationFy(),fy);
    }
    /**
     * 点击提交
     */
    public void clickButn(){
        registerPage.click(registerPage.clickRegisterButton());
    }
    /**
     * 判断是否是注册页面
     */
    public Boolean assertRegister(){
        return registerPage.assertElement(registerPage.registerName());
    }
}
