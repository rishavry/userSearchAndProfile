package com.example.springBootFrontend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class frontendController {

    @GetMapping("/search/{username}")
    public String home(@PathVariable String username, Model model) {
        model.addAttribute("username", username);
        return "search";
    }

    @GetMapping("/profilePage/{authenticatedUsername}/{profileUsername}")
    public String profilePage(@PathVariable String authenticatedUsername, @PathVariable String profileUsername, Model model) {
        model.addAttribute("authenticatedUsername", authenticatedUsername);
        model.addAttribute("profileUsername", profileUsername);
        return "profilePage";
    }

}
