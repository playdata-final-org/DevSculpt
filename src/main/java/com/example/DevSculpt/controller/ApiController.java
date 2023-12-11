package com.example.DevSculpt.controller;

import com.example.DevSculpt.dto.UserRequestDTO;
import com.example.DevSculpt.dto.UserResponseDTO;
import com.example.DevSculpt.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find")
    public ResponseEntity<UserResponseDTO> findUserByNicknameOrId(
            @RequestParam(value = "userid", required = false) String userid,
            @RequestParam(value = "nickName", required = false) String nickName) {
        if (userid != null || nickName != null) {
            UserResponseDTO finduser = service.findUserByIdAndNickName(userid, nickName);
            return ResponseEntity.ok(finduser);
        } else {
            return null;
        }
    }
}