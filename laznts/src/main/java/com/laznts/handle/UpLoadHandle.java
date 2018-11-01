package com.laznts.handle;

import com.laznts.base.DriverBase;
import com.laznts.page.UpLoadPage;

/**
 * Created by liang on 2018/10/29.
 */
public class UpLoadHandle {
    public UpLoadPage upLoadPage;
    public DriverBase driverBase;
    public UpLoadHandle(DriverBase driverBase){
        this.driverBase=driverBase;
        upLoadPage=new UpLoadPage(driverBase);
    }
    /**
     * 上传文档
     */
    public void sendWord(String wordUrl){
        upLoadPage.sendKeys(upLoadPage.uploadInput(),wordUrl);
    }
    /**
     * 点击检索
     */
    public void clickSearch(){
        upLoadPage.click(upLoadPage.searchButton());
    }
}
