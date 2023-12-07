package com.example.DevSculpt.controller;

import com.example.DevSculpt.dto.UserRequestDTO;
import com.example.DevSculpt.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {

    private final UserService service;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserRequestDTO requestDTO) {
        service.createUser(requestDTO);
        return ResponseEntity.ok("성공");
    }
}
