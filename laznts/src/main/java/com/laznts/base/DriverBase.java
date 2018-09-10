package com.laznts.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/23.
 */
public class DriverBase {
    public WebDriver driver;
    @Test
    public DriverBase(String browser){
        SelectDriver selectDriver=new SelectDriver();
       this.driver= selectDriver.driverName(browser);
    }
    public void stop(){
        System.out.println("stop webdrivers");
        driver.close();
    }
    /**
     * get方法
     */
    public void get(String url){
    driver.get(url);
    }
    /**
     * 封装Element方法
     */
    public WebElement findelement(By by){

        WebElement element=driver.findElement(by);
        return element;
    }
    /**
     * 窗口最大化
     */
    public void sizeWindow(){
        driver.manage().window().maximize();
    }

    /**
     * 关闭窗口方法
     */
    public void close(){
        driver.quit();
    }
}
