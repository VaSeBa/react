package ru.vaseba.react.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import ru.vaseba.react.domain.User;

public interface UserRepo extends ReactiveCrudRepository<User, Long> {
    Mono<User> findByUsername(String name);
}
