package com.laznts.test;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liang on 2018/12/12.
 */
public class TestExcel {

    public static  void main(String[]args){
        String[]title={"以文检索案件名称","案件1名称+标签","案件2名称+标签","案件3名称+标签","案件4名称+标签","案件5名称+标签","案件6名称+标签",
                "案件7名称+标签","案件8名称+标签","案件9名称+标签","案件10名称+标签","案件11名称+标签","案件12名称+标签",
                "案件13名称+标签","案件14名称+标签","案件15名称+标签","案件16名称+标签","案件17名称+标签","案件18名称+标签",
                "案件19名称+标签","案件20名称+标签"

        };
        String name="梁越";
        String age="11";
        String sex="男";
        //创建excel工作簿
        HSSFWorkbook hssfWorkbook=new HSSFWorkbook();
        //创建一个工作表sheet
        HSSFSheet hssfSheet=hssfWorkbook.createSheet();
        HSSFRow row=hssfSheet.createRow(0);
        HSSFCell cell=null;
        for(int i=0;i<title.length;i++){
            cell=row.createCell(i);
            cell.setCellValue(title[i]);

        }
        for (int i=1;i<title.length;i++){
            HSSFRow nextrow=hssfSheet.createRow(i);
            HSSFCell cell2=nextrow.createCell(0);
            cell2.setCellValue(name);
            cell2=nextrow.createCell(1);
            cell2.setCellValue(age);
            cell2=nextrow.createCell(2);
            cell2.setCellValue(sex);
            cell2=nextrow.createCell(3);
            cell2.setCellValue("年龄");
            cell2=nextrow.createCell(4);
            cell2.setCellValue("年龄1");
            cell2=nextrow.createCell(5);
            cell2.setCellValue("年2");
            cell2=nextrow.createCell(6);
            cell2.setCellValue("年龄3");
            cell2=nextrow.createCell(7);
            cell2.setCellValue("年龄4");
            cell2=nextrow.createCell(8);
            cell2.setCellValue("年龄5");
            cell2=nextrow.createCell(9);
            cell2.setCellValue("年龄6");
            cell2=nextrow.createCell(10);
            cell2.setCellValue("年龄7");
            cell2=nextrow.createCell(11);
            cell2.setCellValue("年龄8");
            cell2=nextrow.createCell(12);
            cell2.setCellValue("年龄9");
            cell2=nextrow.createCell(13);
            cell2.setCellValue("年龄10");
            cell2=nextrow.createCell(14);
            cell2.setCellValue("年龄11");
            cell2=nextrow.createCell(15);
            cell2.setCellValue("年龄12");
            cell2=nextrow.createCell(16);
            cell2.setCellValue("年龄13");
            cell2=nextrow.createCell(17);
            cell2.setCellValue("年龄14");
            cell2=nextrow.createCell(18);
            cell2.setCellValue("年龄15");
            cell2=nextrow.createCell(19);
            cell2.setCellValue("年龄16");
            cell2=nextrow.createCell(20);
            cell2.setCellValue("年龄17");

        }
        File file=new File("d:/poi.xls");
        try {
            file.createNewFile();
            FileOutputStream stream= FileUtils.openOutputStream(file);
            hssfWorkbook.write(stream);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
