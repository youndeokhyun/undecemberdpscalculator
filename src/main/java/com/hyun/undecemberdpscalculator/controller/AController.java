package com.hyun.undecemberdpscalculator.controller;

import com.hyun.undecemberdpscalculator.service.zodiac.t1.Afros;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AController {
   // localstorage 사용
    @GetMapping("/")
    public String mainPage(){
        return "main";
    }

}
