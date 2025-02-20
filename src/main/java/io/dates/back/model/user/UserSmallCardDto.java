package io.dates.back.model.user;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserSmallCardDto {
    long id;
    String name;
    String age;
    String city;
    String km;
}
