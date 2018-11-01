package com.laznts.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by liang on 2018/10/29.
 */
public class upload {
    public static void main(String[]args){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\liang\\Desktop\\repository\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://124.205.50.166:8082/caa_v3.0/jsp/index.html");
        //driver.findElement(By.id("upFile")).click();
        driver.findElement(By.className("search_ipt")).sendKeys("C:\\Users\\liang\\Desktop\\涉诉信息服务-公共模型-行业企业-V1.2-20181010.docx");
        driver.findElement(By.id("searchBtn")).click();
    }
}