package ru.vaseba.react.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.vaseba.react.domain.Message;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {

}
