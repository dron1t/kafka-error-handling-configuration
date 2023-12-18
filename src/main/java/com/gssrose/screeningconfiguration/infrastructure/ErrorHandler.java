package com.gssrose.screeningconfiguration.infrastructure;

public interface ErrorHandler<T> {

    public String handle(T error);

    public String errorClass();
}
