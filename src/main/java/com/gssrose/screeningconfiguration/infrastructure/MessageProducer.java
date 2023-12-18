package com.gssrose.screeningconfiguration.infrastructure;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private final KafkaTemplate<String, Message> producer;

    public MessageProducer(KafkaTemplate<String, Message> producer) {
        this.producer = producer;
    }

    public void produceAMessage(String name, String id) {
        producer.send("topic-test-1", new Message(name, id));
    }
}
