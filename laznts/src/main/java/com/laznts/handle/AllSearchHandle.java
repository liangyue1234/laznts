package com.laznts.handle;

import com.laznts.base.DriverBase;
import com.laznts.page.AllSearchPage;

/**
 * Created by liang on 2018/9/17.
 */
public class AllSearchHandle {
    public AllSearchPage allSearch;
    public DriverBase driverBase;
    public AllSearchHandle(DriverBase driverBase){
         this.driverBase=driverBase;
         allSearch=new AllSearchPage(driverBase);
    }

    /**
     * 搜索框输入
     * @param
     */
    public void sendSearch(String vaule){
       allSearch.sendKeys(allSearch.getSearch(),vaule);
    }

    /**
     * 点击搜索按钮
     */
    public void clickSearchButton(){
        allSearch.click(allSearch.getSearchButton());
    }
    /**
     * 判断输入框是否存在
     */
    public Boolean arrsertSearch(){
        return allSearch.assertElement(allSearch.getSearch());
    }
}
