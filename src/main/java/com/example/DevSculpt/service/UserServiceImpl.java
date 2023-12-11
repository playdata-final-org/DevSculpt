package com.example.DevSculpt.service;

import com.example.DevSculpt.dao.UserDAO;
import com.example.DevSculpt.dto.UserRequestDTO;
import com.example.DevSculpt.dto.UserResponseDTO;
import com.example.DevSculpt.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO dao;

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestDTO) {
        // Model Mapper 를 사용해서 DTO -> 엔티티 변환 작업
        ModelMapper mapper = new ModelMapper();
        UserEntity userentity = mapper.map(requestDTO, UserEntity.class);

        UserEntity savedEntity = dao.save(userentity);
        return mapper.map(savedEntity, UserResponseDTO.class);
    }

    @Override
    public UserRequestDTO updateUser(UserRequestDTO requestDTO) {
        return null;
    }

    @Override
    public UserResponseDTO getUserById(Long userId) {
        return null;
    }

    @Override
    public UserResponseDTO findUserByIdAndNickName(String userid, String nickName) {
        ModelMapper mapper = new ModelMapper();
        UserEntity userEntity = dao.findByUseridOrNickName(userid, nickName);
        if (userEntity != null) {
            return mapper.map(userEntity, UserResponseDTO.class);
        }
        return null;
    }
}
