package com.laznts.testcase;

import com.laznts.base.DriverBase;
import com.laznts.business.RegisterPro;
import com.laznts.business.UpLoadPro;
import com.laznts.entity.User_register;
import com.laznts.util.DataBaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by liang on 2018/10/29.
 */
public class Upload extends CaseBase {
    public static Logger logger=Logger.getLogger(Upload.class);
    public DriverBase driverBase;
    public UpLoadPro upLoadPro;
    public Upload(){
        this.driverBase= InitDriver("chrome");
        upLoadPro=new UpLoadPro(driverBase);
    }
    @BeforeMethod
    public void getUploadHome(){
        driverBase.get("http://192.168.10.111:8084/caa_v3.0/jsp/index.html");
        driverBase.sizeWindow();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void upLoadCase(){
        upLoadPro.upLoadFile();
        logger.info("上传日志");
        driverBase.close();
    }


}
