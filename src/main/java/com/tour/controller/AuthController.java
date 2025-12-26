package com.tour.controller;

import com.tour.dto.LoginRequest;
import com.tour.dto.LoginResponse;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // React साठी important
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {

        // Hardcoded user (आजसाठी)
        if (request.getEmail().equals("admin@gmail.com")
                && request.getPassword().equals("123456")) {

            return new LoginResponse("Login successful", true);
        }

        return new LoginResponse("Invalid credentials", false);
    }
}

