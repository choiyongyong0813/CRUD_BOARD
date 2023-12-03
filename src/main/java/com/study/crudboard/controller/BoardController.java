package com.study.crudboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "meta");
        model.addAttribute("img", "image/test.jpg");
        return "index";
    }
}
