package com.j2program;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/register")
    public String showForm(Model model){

        User user = new User();
        model.addAttribute("user", user);

        List<String> professionlList = Arrays.asList("Developer", "Designer", "Archtect");
        model.addAttribute("professionlist", professionlList);

        return "/forms/register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user){
        System.out.println(user);


       return "/forms/register_success";
    }

}
