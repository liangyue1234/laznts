package com.laznts.page;

import com.laznts.base.DriverBase;
import com.laznts.util.getByLocator;
import org.openqa.selenium.WebElement;

/**
 * Created by liang on 2018/9/17.
 */
public class AllSearchPage extends  BasePage{

    public AllSearchPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取搜索框
     * @return
     */
   public WebElement getSearch(){
        return element(getByLocator.getLocator("searchinput"));
   }
    /**
     * 获取搜索按钮
     */
    public WebElement getSearchButton(){
        return element(getByLocator.getLocator("searchbutton"));
    }
}
