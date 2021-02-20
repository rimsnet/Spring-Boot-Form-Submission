package com.j2program;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {

    @GetMapping("/rest")
    public String sayREST(){
        System.out.println("rest url called");
        return "This is my first version";
    }
}
