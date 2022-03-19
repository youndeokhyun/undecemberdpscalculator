package com.hyun.undecemberdpscalculator.controller;

import com.hyun.undecemberdpscalculator.service.zodiac.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AController {

    AttackZodiac attackZodiac;

    @GetMapping("/")
    public String mainPage(Model model){

        model.addAttribute("attack10" , attackZodiac.getAttack10());
        model.addAttribute("attack5" , attackZodiac.getAttack5());
        model.addAttribute("physic" , attackZodiac.getPhysicsDmg10());
        return "index";
    }



}
