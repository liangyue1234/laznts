package com.laznts.business;

import com.laznts.base.DriverBase;
import com.laznts.handle.UpLoadHandle;

/**
 * Created by liang on 2018/10/29.
 */
public class UpLoadPro {
    public UpLoadHandle upLoadHandle;
    public DriverBase driverBase;
    public UpLoadPro(DriverBase driverBase){
        upLoadHandle=new UpLoadHandle(driverBase);
    }
    public void upLoadFile(){
        upLoadHandle.clickUpload();
        upLoadHandle.upFile();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        upLoadHandle.clickSearch();
    }

}
