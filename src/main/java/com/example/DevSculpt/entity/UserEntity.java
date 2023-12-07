package com.example.DevSculpt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "devuser")
public class UserEntity {
    @Id
    @GeneratedValue
    // P.K
    private Long id;
    // 회원 아이디
    private String userid;
    // 회원 비밀번호
    private String password;
    // 회원 이름 (실명)
    private String name;
    // 회원 닉네임
    private String nickName;
    // 회원 이메일
    private String email;
    // 회원 생성날짜
    @CreationTimestamp
    private LocalDateTime registrationDate;
    @UpdateTimestamp
    // 회원 수정날짜
    private LocalDateTime revisionDate;
}
