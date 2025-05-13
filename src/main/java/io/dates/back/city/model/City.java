package io.dates.back.city.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "cities")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @Id
    Long id;

    @Column(nullable = false)
    String name;
}
