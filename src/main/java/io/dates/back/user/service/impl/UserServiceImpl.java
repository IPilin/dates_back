package io.dates.back.user.service.impl;

import io.dates.back.error.model.NotFoundException;
import io.dates.back.user.mapper.UserMapper;
import io.dates.back.user.model.UserShortDto;
import io.dates.back.user.repository.UserRepository;
import io.dates.back.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Collection<UserShortDto> getAllShorts() {
        return UserMapper.toShortDto(userRepository.findAll());
    }

    @Override
    public UserShortDto shortById(long id) {
        return UserMapper.toShortDto(
                userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found.")));
    }
}
