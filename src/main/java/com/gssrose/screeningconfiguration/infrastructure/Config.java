package com.gssrose.screeningconfiguration.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;

import java.util.List;

@Configuration
public class Config {

    @Bean
    SpecialExceptionErrorHandler specialExceptionErrorHandler() {
        return new SpecialExceptionErrorHandler();
    }

    @Bean
    ErrorHandlersFactory errorHandlersFactory(List<ErrorHandler> errorHandlerList) {
        return new ErrorHandlersFactory(errorHandlerList);
    }

    @Bean
    KafkaListenerErrorHandler consumerErrorHandler(ErrorHandlersFactory errorHandlersFactory) {
        return (msg, ex) -> {
            var errorHandler = errorHandlersFactory.getErrorHandler(ex.getRootCause().getClass().getName());
            errorHandler.handle(ex.getRootCause());
            System.out.println("CAN WE DO LOGIC HERE");
            System.out.println(ex.getRootCause());
            return "SUCCESS";
        };
    }
}
