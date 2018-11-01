package com.laznts.entity;

import lombok.Data;

/**
 * Created by liang on 2018/10/29.
 */
@Data
public class User_register {
    private  int id;
    private  String username;
    private  String  password;
    private  String confirm_password;
    private String  law;
}
