import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liang on 2018/8/16.
 */
public class LoginCase {


    public static void main(String[]args) throws InterruptedException {


        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:/Users/liang/Desktop/repository/chromedriver.exe");
       driver=new ChromeDriver();
      driver.get("http://124.205.50.166:8082/caa_v3.0/jsp/index.html");
      driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[1]/i")).click();
        Thread.sleep(3000);

WebElement element=   driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[2]"));
        List<WebElement>list= element.findElements(By.tagName("ul"));
           for(WebElement ll:list){

                 ll.findElement(By.linkText("本院认为")).click();
               driver.findElement(By.className("search_ipt")).sendKeys("离婚");
               driver.findElement(By.id("searchBtn")).click();
               Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/a/img")).click();

           }
           driver.close();


    }
}
