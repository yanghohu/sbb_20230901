package com.mysite.sbb.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/sbb")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/plus")
    @ResponseBody
    public int plus(int a,int b) {
        return a+b;
    }
}
