package com.sim.user.service;

import com.sim.user.dto.UserCreateRequest;
import com.sim.user.dto.UserInfoResponse;
import com.sim.user.mapper.UserMapper;
import com.sim.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createUser(UserCreateRequest request) {
        userRepository.save(UserMapper.mapUserCreateRequestToUser(request));
    }

    public UserInfoResponse getUserInfo(String username) {
        return userRepository.findByUsername(username)
                .map(UserMapper::mapUserToUserInfoResponse)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
