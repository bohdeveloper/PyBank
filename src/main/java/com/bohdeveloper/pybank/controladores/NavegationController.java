package com.bohdeveloper.pybank.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavegationController {
    
    @GetMapping("/")
    public String goIndex(){
        return "index";
    }

}
