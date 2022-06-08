package com.hyun.undecemberdpscalculator.controller;

import com.hyun.undecemberdpscalculator.dto.WeaponDto;
import com.hyun.undecemberdpscalculator.dto.ZodiacDto;
import com.hyun.undecemberdpscalculator.service.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AController {

    Calculator cal = new Calculator();

    @GetMapping("/")
    public String mainPage(Model model){

        return "index";
    }

    @PostMapping("/")
    public String weaponApply(HttpServletRequest request , WeaponDto wDto){
        String referer = request.getHeader("referer");
        double speed = cal.speed(wDto);
        return "redirect:"+referer;
    }


    @PostMapping("/zodiacform")
    public String zodiacApply(HttpServletRequest request , ZodiacDto zDto){
        String referer = request.getHeader("referer");
        return "redirect:"+referer;
    }



}
