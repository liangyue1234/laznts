package com.laznts.testcase;

import com.laznts.base.DriverBase;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2018/8/23.
 */
public class CaseBase {
    public  WebDriver driver;
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
