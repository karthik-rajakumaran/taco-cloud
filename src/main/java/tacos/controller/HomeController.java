package tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("Title", "Welcome to...");
        return "home";
    }
}
