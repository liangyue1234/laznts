package com.laznts.testcase;

import com.laznts.base.DriverBase;

/**
 * Created by Administrator on 2018/8/23.
 */
public class CaseBase {
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
