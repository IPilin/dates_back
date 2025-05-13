package io.dates.back.user.mapper;

import io.dates.back.user.model.User;
import io.dates.back.user.model.UserShortDto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserShortDto toShortDto(User user) {
        return UserShortDto.builder()
                .id(user.getId())
                .name(user.getName())
                .age(String.valueOf(Period.between(user.getBirthday(), LocalDate.now()).getYears()))
                .city(user.getCity().getName())
                .gender(user.getGender())
                .build();
    }

    public static Collection<UserShortDto> toShortDto(Collection<User> users) {
        return users.stream().map(UserMapper::toShortDto).collect(Collectors.toList());
    }
}
