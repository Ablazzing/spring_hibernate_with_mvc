package com.molodyko.mvc_plus_hibernate;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("show")
    public String showDetail(){
            return "show-detail";
    }


}
