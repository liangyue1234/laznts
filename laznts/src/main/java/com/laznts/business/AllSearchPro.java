package com.laznts.business;

import com.laznts.base.DriverBase;
import com.laznts.handle.AllSearchHandle;

/**
 * Created by liang on 2018/9/17.
 */
public class AllSearchPro {
    public AllSearchHandle allSearchHandle;
    public AllSearchPro(DriverBase driverBase){
        allSearchHandle=new AllSearchHandle(driverBase);
    }
    /**
     * 判断元素是否存在
     */
    public void search(String vaule){
if(allSearchHandle.arrsertSearch()){
    allSearchHandle.sendSearch(vaule);
    allSearchHandle.clickSearchButton();
}else{
    System.out.println("失败");
}
    }
}
