package com.gssrose.screeningconfiguration.infrastructure;

public class SpecialException extends RuntimeException {

    private static final String MESSAGE = "SOME MESSAGE TEMPLATE %s";

    private String something = "Somethign";

    public String getSomething() {
        return something;
    }

    public SpecialException(String name) {
        super(MESSAGE.formatted(name));
    }
}
