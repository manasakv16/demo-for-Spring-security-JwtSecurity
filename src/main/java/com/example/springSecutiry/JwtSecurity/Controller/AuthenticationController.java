package com.example.springSecutiry.JwtSecurity.Controller;

import com.example.springSecutiry.JwtSecurity.Entity.User;
import com.example.springSecutiry.JwtSecurity.dto.JwtAuthenticationResponse;
import com.example.springSecutiry.JwtSecurity.dto.RefreshTokenRequest;
import com.example.springSecutiry.JwtSecurity.dto.SignInRequest;
import com.example.springSecutiry.JwtSecurity.dto.SignUpRequest;
import com.example.springSecutiry.JwtSecurity.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authService.SignUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authService.signIn(signInRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest){
        JwtAuthenticationResponse jwtAuthenticationResponse = authService.refreshToken(refreshTokenRequest);
        return ResponseEntity.ok(jwtAuthenticationResponse);
    }
}
