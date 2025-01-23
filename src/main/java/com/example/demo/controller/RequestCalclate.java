package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestCalculate")
public class RequestCalclate {
   
    @RequestMapping("")
    public String add() {
        return "request-calculate-form";
    }
    
    @RequestMapping("input2")
    public String input2(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, Model model){
        int total = num1 + num2; 
        int total2 = num3 - num4;
        int total3 = num5 * num6;
        int total4 = num7 / num8;

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", total);
        model.addAttribute("num3", num3);
        model.addAttribute("num4", num4);
        model.addAttribute("result2", total2);
        model.addAttribute("num5", num5);
        model.addAttribute("num6", num6);
        model.addAttribute("result3", total3);
        model.addAttribute("num7", num7);
        model.addAttribute("num8", num8);
        model.addAttribute("result4", total4);
        return "result-calculate-scope";
        
    }
}

