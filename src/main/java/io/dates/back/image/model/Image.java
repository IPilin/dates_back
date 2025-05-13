package io.dates.back.image.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "images")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image {
    @Id
    Long id;

    @Column(name = "owner_id",nullable = false)
    Long ownerId;

    @Column(name = "photo_url", nullable = false)
    String photoUrl;

    @Column(nullable = false)
    Boolean isPublic;
}
