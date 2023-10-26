package com.example.springSecutiry.JwtSecurity.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AdminController {

    @GetMapping("/admin")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hi Admin");
    }
}
