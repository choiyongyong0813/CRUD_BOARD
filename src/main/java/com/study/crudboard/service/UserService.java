package com.study.crudboard.service;

import com.study.crudboard.Repository.UserRepository;
import com.study.crudboard.dto.UserDto;
import com.study.crudboard.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserDto createUser(UserDto userDto) {
        // UserDto를 User 엔티티로 변환
        User user = User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .address(userDto.getAddress())
                .gender(userDto.getGender())
                .phoneNumber(userDto.getPhoneNumber())
                .build();
    // 엔티티 저장
        User savedUser = userRepository.save(user);

        // 저장된 엔티티를 다시 UserDto로 변환하여 반환
        return null;
    }
}
