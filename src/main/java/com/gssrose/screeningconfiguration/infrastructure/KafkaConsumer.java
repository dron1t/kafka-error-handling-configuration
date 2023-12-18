package com.gssrose.screeningconfiguration.infrastructure;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic-test-1", errorHandler = "consumerErrorHandler")
    public void listen(Message message) {
        throw new SpecialException(message.name());
    }
}

