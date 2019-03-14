package com.laznts.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;

/**
 * Created by liang on 2018/11/27.
 */
public class UpFile {
    public WebDriver driver;
    String name;

    public void InDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liang\\Desktop\\repository\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://192.168.10.111:8084/caa_v3.0/jsp/index.html");
        driver.manage().window().maximize();

    }

    public void upFile() {
        driver.findElement(By.id("upFile")).click();
        try {
            Runtime.getRuntime().exec("D:\\lzznts\\laznts\\laznts\\laznts\\File\\upfile.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("searchBtn")).click();
    }

    public void getAuttont() throws IOException, InterruptedException {

        WebElement elementList = driver.findElement(By.className("result_box"));
        List<WebElement> elements = elementList.findElements(By.id("item_1"));
        for (WebElement em:elements){
            String title1=em.findElement(By.xpath("//*[@id=\"item_1\"]/div[1]/h4")).getText();

          List<WebElement> name=  em.findElements(By.className("b_chose"));
                    for (WebElement name1:name){

                      String name2=name1.getText();
                        System.out.print(name2.getBytes());

                    }
                    driver.close();


        }

        }





    public static void main(String[] args) throws IOException, InterruptedException {
        UpFile upFile = new UpFile();
        upFile.InDriver();
        upFile.upFile();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        upFile.getAuttont();

    }

}