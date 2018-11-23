package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController{

    @RequestMapping("/test")
    public String Test(){
        System.out.println("123456");
        return "";
    }
}
