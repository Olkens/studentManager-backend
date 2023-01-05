package com.example.wers.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin("http://localhost:5173/login")
@RequestMapping("api/")
public class GreetingController {

    @GetMapping("greetings")
    @CrossOrigin
    public ResponseEntity<String> sayHello(Principal principal) {
        return ResponseEntity.ok().body("Hello mordo userze " + principal.getName());
    }

    @GetMapping("bye")
    public ResponseEntity<String> sayGoodbye() {
        return ResponseEntity.ok().body("Elo papa");
    }

}
