package com.hyun.undecemberdpscalculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZodiacController {


    @GetMapping("/zodiacmain")
    public String zodiacMainPage(){
        return "/zodiac/zodiacmain";
    }

    @GetMapping("/zodiac/afros")
    public String afrosPage(){
        return "/zodiac/tear1/afros";
    }

}
