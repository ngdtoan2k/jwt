package com.example.jwtspring.dto;

import lombok.Data;

@Data
public class AuthenticationDTO {

    private String email;

    private String password;

}
