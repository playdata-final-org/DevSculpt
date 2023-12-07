package com.example.DevSculpt.dao;

import com.example.DevSculpt.entity.UserEntity;
import com.example.DevSculpt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO {
    private final UserRepository repository;

    @Override
    public UserEntity save(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public UserEntity findById(Long userId) {
        return repository.findById(userId).orElse(null);
    }
}
