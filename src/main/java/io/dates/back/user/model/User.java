package io.dates.back.user.model;

import io.dates.back.city.model.City;
import io.dates.back.image.model.Image;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    LocalDate birthday;

    String gender;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    City city;

    @ManyToOne
    @JoinColumn(name = "avatar_id")
    Image avatar;
}
