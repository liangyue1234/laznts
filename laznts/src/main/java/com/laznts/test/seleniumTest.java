package com.laznts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class seleniumTest {
    public WebDriver driver;
    String name;
@Test
    public void InDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liang\\Desktop\\repository\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http:www.baidu.com");
        driver.manage().window().maximize();
    /**
     * 显示等待

    WebElement element=new WebDriverWait(driver,5).
            until(ExpectedConditions.presenceOfElementLocated(By.id("wd")));
           element.sendKeys("离婚");
    /**
     * 隐式等待
     */
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://www.baidu.com");
    driver.findElement(By.id("wd")).sendKeys("梁");
}
}
