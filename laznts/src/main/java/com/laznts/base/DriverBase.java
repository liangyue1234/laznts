package com.laznts.base;

import com.aventstack.extentreports.utils.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Administrator on 2018/8/23.
 */
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        SelectDriver selectDriver=new SelectDriver();
       this.driver= selectDriver.driverName(browser);
    }

    /**
     * 关闭方法
     */
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
    /**
     * 后退
     */
    public void back(){
        driver.navigate().back();
    }
    /**
     * 截图
     */
    public void screenShot() throws IOException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        String time=dateFormat.format(Calendar.getInstance().getTime());
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("screenshot",time+".png"));
    }
    /**
     * 获取文本信息
     */
    public String  getText(By by){

        return driver.findElement(by).getText();
    }
}
