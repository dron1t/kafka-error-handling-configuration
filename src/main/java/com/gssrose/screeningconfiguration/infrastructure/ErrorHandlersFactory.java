package com.gssrose.screeningconfiguration.infrastructure;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ErrorHandlersFactory {

    private final Map<String, ErrorHandler> errorHandlers;

    public ErrorHandlersFactory(List<ErrorHandler> errorHandlerList) {
        this.errorHandlers = errorHandlerList.stream().collect(Collectors.toMap(e -> e.errorClass(), e-> e));
    }

    public ErrorHandler getErrorHandler(String errorClassName) {
        if (!errorHandlers.containsKey(errorClassName)){
            return errorHandlers.get("DEFAULT");
        }
        return errorHandlers.get(errorClassName);
    }
}
