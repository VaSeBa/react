package ru.vaseba.react.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.vaseba.react.domain.Message;
import ru.vaseba.react.service.MessageService;

@RestController
@RequestMapping("/controller")
public class MainController {
    private final MessageService messageService;

    @Autowired
    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public Flux<Message> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count
    ) {
        return messageService.list();
    }

    @PostMapping
    public Mono<Message> add(@RequestBody Message message) {
        return messageService.addOne(message);
    }
}
