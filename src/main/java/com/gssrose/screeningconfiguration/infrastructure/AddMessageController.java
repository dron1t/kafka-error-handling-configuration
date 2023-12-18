package com.gssrose.screeningconfiguration.infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AddMessageController {

    private final MessageProducer messageProducer;

    public AddMessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping("/add/{name}/{id}")
    public Mono<String> add(@PathVariable String name, @PathVariable String id) {
        messageProducer.produceAMessage(name, id);
        return Mono.just("OK!");
    }
}
