﻿package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloAction {

    @RequestMapping("/boot")
    @ResponseBody
    public  String   boot() throws Exception{
	//哈哈哈
	    
	    
	    
	    //你好啊
        System.out.println("Hello  SpringBoot");
        return "hello  SpringBoot";
    }

}
