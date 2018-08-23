package com.laznts.page;

import com.laznts.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/8/23.
 */
public class BasePage {
   public DriverBase driver;
   public BasePage(DriverBase driver){
  this.driver=driver;
   }
    /**
     * 定位Element
     *
     */
    public WebElement element(By by){
        WebElement element=driver.findelement(by);
        return element;
    }
    /**
     * 封装点击
     */
    public void click(WebElement element){
        if (element !=null){
            element.click();
        }else{
            System.out.println("元素不存在，点击失败");
        }
    }
    /**
     * 封装输入
     */
    public void sendKeys(WebElement element,String  value){
        if(element !=null){
            element.sendKeys(value);
        }else {
            System.out.println(element+"元素没有定位到输入失败"+value);
        }

    }
    /**
     * 判断元素是否显示
     */
    public Boolean assertElement(WebElement element){
        element.isDisplayed();
        return true;
    }
}
