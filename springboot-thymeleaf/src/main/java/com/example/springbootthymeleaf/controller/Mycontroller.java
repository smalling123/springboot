package com.example.springbootthymeleaf.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2020/3/14
 * @Time:11:03
 */
@Controller
public class Mycontroller {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","hello thymeleaf");
        return "index";
    }
}
