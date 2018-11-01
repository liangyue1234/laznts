package com.laznts.business;

import com.laznts.base.DriverBase;
import com.laznts.handle.RegisterPageHandle;

/**
 * Created by liang on 2018/9/12.
 */
public class RegisterPro {
    public RegisterPageHandle registerPageHandle;
    public RegisterPro(DriverBase driverBase){

        registerPageHandle=new RegisterPageHandle(driverBase);
    }
    public void register(String name,String pwd1,String pwd2,String fy){
          if(registerPageHandle.assertRegister()){
              registerPageHandle.clickRegister();
              registerPageHandle.inputName(name);
              registerPageHandle.inputPwd(pwd1);
              registerPageHandle.establishedPwd2(pwd2);
              registerPageHandle.szFy(fy);
              registerPageHandle.clickButn();
          }else{
              System.out.println("注册失败");
          }
    }
}
