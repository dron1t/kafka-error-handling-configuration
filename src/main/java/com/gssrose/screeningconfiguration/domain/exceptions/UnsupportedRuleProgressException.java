package com.gssrose.screeningconfiguration.domain.exceptions;

import com.gssrose.screeningconfiguration.domain.entities.Rule;

public class UnsupportedRuleProgressException extends RuntimeException {

    private static final String message = "Unsupported rule progression attempt. From [%s]";

    public UnsupportedRuleProgressException(Rule rule) {
        super(message.formatted(rule.getClass().getName()));
    }
}
