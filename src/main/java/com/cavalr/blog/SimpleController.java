package com.cavalr.blog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping (value = "/home", method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }
}
