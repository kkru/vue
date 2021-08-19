package app.messages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/message")
public class MessageController {
    
    @GetMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "Hello, Welcome to Spring Boot!";
    }
    
}
