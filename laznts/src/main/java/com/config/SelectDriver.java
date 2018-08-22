package com.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by liang on 2018/8/16.
 */
public class SelectDriver {
    private WebDriver driver;
    @Test
    public WebDriver driverNmae(String Borwse){
   //System.out.println(ll);
        if(Borwse.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:/Users/liang/Desktop/repository/geckodriver.exe");
            return new FirefoxDriver();
        }if(Borwse.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "C:/Users/liang/Desktop/repository/chromedriver.exe");
            return new ChromeDriver();
        }

     return null;
    }
}
