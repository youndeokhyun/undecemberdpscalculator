package com.hyun.undecemberdpscalculator.controller;

import com.hyun.undecemberdpscalculator.service.zodiac.*;
import com.hyun.undecemberdpscalculator.service.zodiac.t1.Afros;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

@Controller
@AllArgsConstructor
public class AController {
   // localstorage 사용
    @GetMapping("/")
    public String mainPage(Model model){
        Afros afros = new Afros();
        model.addAttribute("attack10" ,afros.getAttack10());
        model.addAttribute("attack5" ,afros.getAttack5());
        model.addAttribute("speed2" ,afros.getAttackSpeed2());
        model.addAttribute("rating10" ,afros.getAttackHitRating10());
        return "index";
    }

}
