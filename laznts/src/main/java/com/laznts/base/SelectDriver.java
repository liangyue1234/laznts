package com.laznts.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Administrator on 2018/8/22.
 */
public class SelectDriver {
       public WebDriver driverName(String browser){
         if(browser.equalsIgnoreCase("chrome")){
             System.setProperty("webdriver.chrome.driver","C:\\Users\\liang\\Desktop\\repository\\chromedriver.exe");
             return new ChromeDriver();
         }else {
             System.setProperty("webdriver.firefox.driver","C:\\Users\\Administrator\\Desktop\\driver\\geckodriver.exe");
             return new FirefoxDriver();
         }
       }

}
