package com.laznts.test;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by liang on 2018/11/26.
 */
public class Test {
  public static  void main(String[]args) throws IOException {
      try {
          String content = "测试使用字符串";
          File file = new File("d:/mytest.txt");
          //文件不存在时候，主动穿件文件。
          if(!file.exists()){
              file.createNewFile();
          }
          FileWriter fw = new FileWriter(file,false);
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write(content);
          bw.close(); fw.close();
          System.out.println("test2 done!");

      } catch (Exception e) {
          // TODO: handle exception
      }
}}