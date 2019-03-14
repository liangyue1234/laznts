package com.laznts.page;

import com.laznts.base.DriverBase;
import com.laznts.util.getByLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by liang on 2018/11/27.
 */
public class AllSearchDocumentViewPage extends BasePage{

    public AllSearchDocumentViewPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取文书id
     * @return
     */
    public WebElement getDocument(){
        return element(getByLocator.getLocator("documentid"));
    }
}
