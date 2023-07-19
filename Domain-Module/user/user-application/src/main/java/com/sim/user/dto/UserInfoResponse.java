package com.sim.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class UserInfoResponse {
    private final Long id;
    private final String username;
    private final String password;
}
