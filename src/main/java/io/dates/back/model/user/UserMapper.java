package io.dates.back.model.user;

import java.util.Collection;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserCardDto toDto(User user) {
        return UserCardDto.builder()
                .id(user.getId())
                .name(user.getName())
                .age(user.getAge())
                .city(user.getCity())
                .km(user.getKm())
                .photoUrls(user.getPhotoUrls())
                .marriage(user.getMarriage())
                .gender(user.getGender())
                .religion(user.getReligion())
                .height(user.getHeight())
                .education(user.getEducation())
                .build();
    }

    public static Collection<UserCardDto> toDto(Collection<User> users) {
        return users.stream().map(UserMapper::toDto).collect(Collectors.toList());
    }
}
