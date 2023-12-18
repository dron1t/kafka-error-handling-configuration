package com.gssrose.screeningconfiguration.domain.entities;

public class PendingDeletionRule extends Rule {
    public PendingDeletionRule(Rule activeRule) {
        super(activeRule.getProfileId(), activeRule.getMatch());
    }

    @Override
    public Rule progressSuccessfully() {
        return new DeletedRule(this);
    }

    @Override
    public Rule progressUnsuccessfully() {
        return new DeletionFailedRule(this);
    }
}
