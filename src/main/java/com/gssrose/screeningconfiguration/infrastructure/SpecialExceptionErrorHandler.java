package com.gssrose.screeningconfiguration.infrastructure;

public class SpecialExceptionErrorHandler implements ErrorHandler<SpecialException> {

    @Override
    public String handle(SpecialException error) {
        System.out.println(error.getSomething());
        return null;
    }

    @Override
    public String errorClass() {
        return SpecialException.class.getName();
    }
}
