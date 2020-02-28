package com.yw.sgxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FruitController {

    @GetMapping("/list")
    public String list(){
        return "shop";
    }

}
