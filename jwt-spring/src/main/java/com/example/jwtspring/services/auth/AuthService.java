package com.example.jwtspring.services.auth;

//import com.springjwt.dto.SignupDTO;
//import com.springjwt.dto.UserDTO;

import com.example.jwtspring.dto.SignupDTO;
import com.example.jwtspring.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
