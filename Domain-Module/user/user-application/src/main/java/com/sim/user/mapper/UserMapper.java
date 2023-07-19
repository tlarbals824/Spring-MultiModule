package com.sim.user.mapper;

import com.sim.user.domain.User;
import com.sim.user.dto.UserCreateRequest;
import com.sim.user.dto.UserInfoResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static User mapUserCreateRequestToUser(UserCreateRequest request) {
        return User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
    }

    public static UserInfoResponse mapUserToUserInfoResponse(User user) {
        return new UserInfoResponse(user.getId(), user.getUsername(), user.getPassword());
    }
}
