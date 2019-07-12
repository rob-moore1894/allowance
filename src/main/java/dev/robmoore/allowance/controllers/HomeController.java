package dev.robmoore.allowance.controllers;

import dev.robmoore.allowance.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/")
    public String chorePage() { return "redirect:/chores"; }

//    @PostMapping("/register")
//    public String createUser(User)
}
