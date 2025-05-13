package io.dates.back.user.service;

import io.dates.back.user.model.UserShortDto;

import java.util.Collection;

public interface UserService {
    Collection<UserShortDto> getAllShorts();
    UserShortDto shortById(long id);
}
