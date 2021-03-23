package com.example.springboot03web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @Description
 * @author  yifansun
 * @date  2021/3/22 20:45
 * @email yifan@yifansun.cn
 * @version 1.0
 *
 */
@Controller
public class HelloController {

     @RequestMapping("/hello")
     public String hello(Model model){
         //存入数据
         model.addAttribute("msg","Hello,Thymeleaf");
         model.addAttribute("users", Arrays.asList("yifan","hjzy"));
         //classpath:/templates/test.html
         return "hello";
     }
}
