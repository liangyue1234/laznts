package com.laznts.testcase;

import com.laznts.base.DriverBase;
import com.laznts.business.AllSearchPro;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by liang on 2018/9/17.
 */
public class AllSearch extends  CaseBase {
    public AllSearchPro allSearchPro;
     public DriverBase driverBase;
     public AllSearch(){
         this.driverBase=InitDriver("chrome");
         allSearchPro=new AllSearchPro(driverBase);
     }
     @BeforeMethod
     public void getUrl(){
         driverBase.get("http://124.205.50.166:8082/caa_v3.0/jsp/index.html");
         driverBase.sizeWindow();
     }
     @Test
    public void allSearchCase(){
         allSearchPro.search("离婚");
     }
     @AfterMethod
    public void closeAllSearch(){
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         driverBase.close();
     }
}
