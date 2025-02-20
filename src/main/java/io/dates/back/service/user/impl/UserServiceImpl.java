package io.dates.back.service.user.impl;

import io.dates.back.model.error.NotFoundException;
import io.dates.back.model.user.UserCardDto;
import io.dates.back.model.user.UserMapper;
import io.dates.back.repository.user.UserRepository;
import io.dates.back.repository.user.impl.UserInMemRepository;
import io.dates.back.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserInMemRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Collection<UserCardDto> getAllCards() {
        return UserMapper.toDto(userRepository.getAll());
    }

    @Override
    public UserCardDto findById(long id) {
        return UserMapper.toDto(
                userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found.")));
    }
}
