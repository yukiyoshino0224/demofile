package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "redirect:/hello/index2";
    }

    @RequestMapping("/index2")
    public String index2() {
        return "hello-world";
    }
    
}
