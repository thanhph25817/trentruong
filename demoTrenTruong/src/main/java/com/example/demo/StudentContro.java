package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentContro {
//    @GetMapping("/vali")
//    public String vaidate(Model model, @ModelAttribute() Student student) {
////        Student student1 = new Student();
////        model.addAttribute("student", student1);
//        return "Hi";
    //}
    @GetMapping("/index")
    public String idnex() {
        return "TrangChu.html";
    }
    @GetMapping("home/about")
    public String about(Model model){
        return "about.html";
    }

    @GetMapping("home/menu")
    public String menu(Model model){
        return "LayOut/menu";
    }

//    @PostMapping("/validator")
//    public String validate(Model model, @Validated @ModelAttribute("student") Student vaidate, Errors errors) {
//        if (errors.hasErrors()) {
//            model.addAttribute("message", "Vui long sua");
//            return "Hi";
//        }
//        return "Success";
//    }
//
//    @ModelAttribute("contries")
//    public Map<String, String> getContries() {
//        Map<String, String> map = new HashMap<>();
//        map.put("VN", "VietNam");
//        map.put("US", "United States");
//        return map;
//    }
}
