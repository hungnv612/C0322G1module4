package com.example.casestudy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String ShowHome() {
        return "home";
    }

//    @GetMapping("/login")
//    public String ShowLogin() {
//        return "login";
//    }


}
