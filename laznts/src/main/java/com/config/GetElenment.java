package com.config;

import org.testng.annotations.Test;

import java.util.ResourceBundle;

/**
 * Created by liang on 2018/8/16.
 */
public class GetElenment {
   @Test
    public static  String   readProperties(){
  ResourceBundle bundle=ResourceBundle.getBundle("element");
 String uil= bundle.getString("url");

   return uil;
    }

}
