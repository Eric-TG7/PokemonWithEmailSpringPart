package com.example.ema.controller;
import com.example.ema.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class UnionController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/confirmation")
    public String greet(@RequestBody Map<String, Object> data) {
        Integer counter = (Integer) data.get("counter");// received from the vue
        String email = (String) data.get("email");

    emailService.sendSimpleMessage(email, " Score!", "your score is " + counter);

        return "fine";

    }
}
