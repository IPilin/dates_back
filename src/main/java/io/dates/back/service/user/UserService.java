package io.dates.back.service.user;

import io.dates.back.model.user.UserCardDto;

import java.util.Collection;

public interface UserService {
    Collection<UserCardDto> getAllCards();
    UserCardDto findById(long id);
}
