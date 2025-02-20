package io.dates.back.repository.user;

import io.dates.back.model.user.User;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {
    Collection<User> getAll();
    Optional<User> findById(long id);
}
