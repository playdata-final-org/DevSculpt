package com.example.DevSculpt.dao;

import com.example.DevSculpt.entity.UserEntity;

public interface UserDAO {
    UserEntity save(UserEntity user);

    UserEntity findById(Long userId);
}
