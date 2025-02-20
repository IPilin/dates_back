package io.dates.back.repository.user.impl;

import io.dates.back.model.user.User;
import io.dates.back.repository.user.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserInMemRepository implements UserRepository {

    private final Map<Long, User> users = new ConcurrentHashMap<>();

    public UserInMemRepository() {
        var user = User
                .builder()
                .id(1)
                .name("Алекса Иванова")
                .age("41")
                .city("г. Ульяновск")
                .km(312)
                .photoUrls(List.of("http://localhost:8080/assets/images/genera28.jpeg"))
                .marriage("Создание брака")
                .religion("Христианство")
                .gender("Женский")
                .height("176 см")
                .education("Высшее")
                .build();
        users.put(1L, user);
        user = User
                .builder()
                .id(2)
                .name("Дрожжин Михаил")
                .age("26")
                .city("г. Москва")
                .km(100)
                .photoUrls(List.of("http://localhost:8080/assets/images/genera29.jpeg"))
                .marriage("Создание брака")
                .religion("Христианство")
                .gender("Мужской")
                .height("181 см")
                .education("Высшее")
                .build();
        users.put(2L, user);
    }

    @Override
    public Collection<User> getAll() {
        return users.values();
    }

    @Override
    public Optional<User> findById(long id) {
        return Optional.ofNullable(users.get(id));
    }
}
