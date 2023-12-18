package com.gssrose.screeningconfiguration.domain.entities;

import com.gssrose.screeningconfiguration.domain.exceptions.UnsupportedRuleProgressException;

public class ActivationFailedRule extends Rule {
    public ActivationFailedRule(PendingActivationRule rule) {
        super(rule.getProfileId(), rule.getMatch());
    }

    @Override
    public Rule progressSuccessfully() {
        return new PendingActivationRule(this);
    }

    @Override
    public Rule progressUnsuccessfully() {
        throw new UnsupportedRuleProgressException(this);
    }
}
