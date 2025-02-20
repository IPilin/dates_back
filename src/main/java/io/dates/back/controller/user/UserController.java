package io.dates.back.controller.user;

import io.dates.back.model.user.UserCardDto;
import io.dates.back.service.user.UserService;
import io.dates.back.service.user.impl.UserServiceImpl;
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

    @GetMapping
    public Collection<UserCardDto> getAllCards() {
        return userService.getAllCards();
    }

    @GetMapping("/{userId}")
    public UserCardDto findById(@PathVariable long userId) {
        return userService.findById(userId);
    }
}
