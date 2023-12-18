package com.gssrose.screeningconfiguration.domain.entities;

public class ActiveRule extends Rule {

    public ActiveRule(PendingActivationRule pendingActivationRule) {
        super(pendingActivationRule.profileId, pendingActivationRule.match);
    }

    @Override
    public Rule progressSuccessfully() {
        return new PendingDeletionRule(this);
    }

    @Override
    public Rule progressUnsuccessfully() {
        return null;
    }
}
