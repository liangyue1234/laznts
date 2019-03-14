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
     * 操作上传文档按钮
     */
    public void clickUpload(){
       upLoadPage.click(upLoadPage.uploadButton());
    }
    /**
     * 上传文件
     */
    public void upFile(){
        upLoadPage.findFile();
    }

    /**
     * 点击检索
     */
    public void clickSearch(){
        upLoadPage.click(upLoadPage.searchButton());
    }
}
