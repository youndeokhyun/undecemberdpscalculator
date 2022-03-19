package com.hyun.undecemberdpscalculator.controller;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.zodiac.ZodiacLogic;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AController {

    ZodiacLogic zodiacLogic;

    @GetMapping("/")
    public String mainPage(Model model){
        long zo = zodiacLogic.getArr();
        model.addAttribute("dmg" , zo);
        return "index";
    }



}
