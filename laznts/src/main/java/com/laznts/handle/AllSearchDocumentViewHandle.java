package com.laznts.handle;

import com.laznts.base.DriverBase;
import com.laznts.page.AllSearchDocumentViewPage;

/**
 * Created by liang on 2018/11/27.
 */
public class AllSearchDocumentViewHandle {
    public AllSearchDocumentViewPage allSearchDocumentViewPage;
    public DriverBase driverBase;
    public AllSearchDocumentViewHandle(DriverBase driverBase){
           this.driverBase=driverBase;
           allSearchDocumentViewPage=new AllSearchDocumentViewPage(driverBase);
    }

}
