package com.sim.user;

import com.sim.user.dto.UserCreateRequest;
import com.sim.user.dto.UserInfoResponse;
import com.sim.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping()
    public void createUser(@RequestBody UserCreateRequest request) {
        userService.createUser(request);
    }

    @GetMapping()
    public UserInfoResponse getUserInfo(@RequestParam String username) {
        return userService.getUserInfo(username);
    }

}
