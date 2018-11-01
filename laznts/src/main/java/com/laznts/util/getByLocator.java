package com.laznts.util;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/8/23.
 */
public  class  getByLocator {
    public static By getLocator(String key){
        ProUtil pro = new ProUtil("D:\\lzznts\\laznts\\laznts\\laznts\\src\\main\\resources\\element.properties");
        String locator = pro.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("tagName")){
            return By.tagName(locatorValue);
        }else if(locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else if(locatorType.equals("xpath")){
                   return By.xpath(locatorValue);
        }else{
            return By.xpath(locatorValue);

        }
    }
}
