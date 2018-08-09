package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class HelloSpringboot {

    @RequestMapping("/")
    public String say() {
        System.out.println("Hello springboot");
        return "hello,this is a springboot demo";
    }
}