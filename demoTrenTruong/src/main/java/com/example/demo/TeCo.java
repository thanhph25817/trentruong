package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeCo {

    @GetMapping("/tes")
    public String getTe(Model model) {
        Tes te = new Tes();
        model.addAttribute("te", te);
        return "student-form";
    }

    @PostMapping("te/save")
    public String sa(@ModelAttribute("tea") Tes tes) {
        return "confirmation";
    }
}
