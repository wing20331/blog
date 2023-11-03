package com.wng.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "главная страница");
        return "index";
    }


}
