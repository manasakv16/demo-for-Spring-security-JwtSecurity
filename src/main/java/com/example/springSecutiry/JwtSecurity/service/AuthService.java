package com.example.springSecutiry.JwtSecurity.service;

import com.example.springSecutiry.JwtSecurity.Entity.User;
import com.example.springSecutiry.JwtSecurity.dto.JwtAuthenticationResponse;
import com.example.springSecutiry.JwtSecurity.dto.RefreshTokenRequest;
import com.example.springSecutiry.JwtSecurity.dto.SignInRequest;
import com.example.springSecutiry.JwtSecurity.dto.SignUpRequest;

public interface AuthService {

    public User SignUp(SignUpRequest signUpRequest);

    public JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
