package com.j2program;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Target;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Hello route called");
        return "hello";
    }


}
