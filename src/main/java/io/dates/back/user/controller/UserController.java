package io.dates.back.user.controller;

import io.dates.back.user.model.UserShortDto;
import io.dates.back.user.service.UserService;
import io.dates.back.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/short")
    public Collection<UserShortDto> getAllCards() {
        return userService.getAllShorts();
    }

    @GetMapping("/short/{userId}")
    public UserShortDto findById(@PathVariable long userId) {
        return userService.shortById(userId);
    }
}
