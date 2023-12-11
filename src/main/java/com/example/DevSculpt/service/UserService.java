package com.example.DevSculpt.service;

import com.example.DevSculpt.dto.UserRequestDTO;
import com.example.DevSculpt.dto.UserResponseDTO;

public interface UserService {
    // 회원 생성
    UserResponseDTO createUser(UserRequestDTO requestDTO);

    // 회원 업데이트
    UserRequestDTO updateUser(UserRequestDTO requestDTO);

    // 회원 아이디 조회하기
    UserResponseDTO getUserById(Long userId);

    // 회원 아이디, 닉네임으로 조회하기
    UserResponseDTO findUserByIdAndNickName(String userid, String nickName);

}
