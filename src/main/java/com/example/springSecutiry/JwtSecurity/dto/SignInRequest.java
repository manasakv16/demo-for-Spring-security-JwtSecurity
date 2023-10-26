package com.example.springSecutiry.JwtSecurity.dto;

import lombok.Data;

@Data
public class SignInRequest {

    private String email;
    private String password;

}
