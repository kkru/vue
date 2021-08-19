package app.messages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageController {
    
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message","Hello, Welcome to Spring Boot!!");
        return "welcome";
    }
    
}
