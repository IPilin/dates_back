package io.dates.back.model.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCardDto {
    @EqualsAndHashCode.Include
    long id;
    String name;
    String age;
    String city;
    int km;
    Collection<String> photoUrls;
    String marriage;
    String gender;
    String religion;
    String height;
    String education;
}
