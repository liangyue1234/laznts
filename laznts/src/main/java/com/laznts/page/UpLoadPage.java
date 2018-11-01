package com.laznts.page;

import com.laznts.base.DriverBase;
import com.laznts.util.getByLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by liang on 2018/10/29.
 */
public class UpLoadPage extends BasePage {
    public UpLoadPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取上传框元素
     */
    public WebElement uploadInput(){

        return element(getByLocator.getLocator("searchinput"));
    }
    /**
     * 获取检索按钮元素
     */
    public WebElement searchButton(){
        return element(getByLocator.getLocator("searchbutton"));
    }
}
