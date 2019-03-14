package com.laznts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;

/**
 * Created by liang on 2018/12/14.
 */
public class UpFiletitle {
    public WebDriver driver;


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


    public void getAuttont() throws IOException {

        WebElement elementList = driver.findElement(By.className("result_box"));
        List<WebElement> elements = elementList.findElements(By.className("result_item"));
              for (WebElement element:elements){


             String  name=element.findElement(By.tagName("h4")).getText();
                  System.out.println(name);
                  String[]sl=name.split(",");

                  File f = new File("D:"+File.separator+"file.txt");
                  OutputStream out = new FileOutputStream(f,true);
                  for (int i=0;i<sl.length;i++){
                      out.write(sl[i].getBytes());
                      out.write('\r');
                      out.write(    '\n');
              }

        }

        }








 public void getkeywords(){
     WebElement elementList = driver.findElement(By.className("result_box"));
     List<WebElement> elements = elementList.findElements(By.className("result_item"));
     for (WebElement es:elements){
        List<WebElement> name= es.findElements(By.className("b_chose"));
        for (WebElement wt:name){
         String   bq=wt.getText();
            String[]jg=bq.split(";");
        for (String ll:jg){
            System.out.print(ll);
        }
            File f = new File("D:"+File.separator+"file.txt");
            OutputStream out = null;
            try {
                
                out = new FileOutputStream(f,true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (int i=0;i<jg.length;i++){
                try {
                    out.write(jg[i].getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    out.write('\r');
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    out.write('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                 //System.out.print(name);

        }
     }
     driver.close();

 }

    public static  void main(String[]args) throws IOException, InterruptedException {

         UpFiletitle upFiletitle=new UpFiletitle();
         upFiletitle.InDriver();
         upFiletitle.upFile();
        Thread.sleep(3000);
        upFiletitle.getAuttont();
        Thread.sleep(3000);
        upFiletitle.getkeywords();



    }
}
