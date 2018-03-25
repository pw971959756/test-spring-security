package com.pw.test.spring.security.controller;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    @RequestMapping("/index")
    String index() {
        return "index";
    }

    @RequestMapping("/login")
    String login() {
        return "login";
    }

    @RequestMapping("/welcome")
    String welcome() {
        return "welcome";
    }
}
