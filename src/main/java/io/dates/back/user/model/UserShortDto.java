package io.dates.back.user.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserShortDto {
    @EqualsAndHashCode.Include
    long id;
    String name;
    String age;
    String city;
    String gender;
    String avatarUrl;
}
