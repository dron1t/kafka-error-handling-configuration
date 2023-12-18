package com.gssrose.screeningconfiguration.domain.entities;

import com.gssrose.screeningconfiguration.domain.exceptions.UnsupportedRuleProgressException;

public class DeletionFailedRule extends Rule {
    public DeletionFailedRule(PendingDeletionRule pendingDeletionRule) {
        super(pendingDeletionRule.getProfileId(), pendingDeletionRule.getMatch());
    }

    @Override
    public Rule progressSuccessfully() {
        return new PendingDeletionRule(this);
    }

    @Override
    public Rule progressUnsuccessfully() {
        throw new UnsupportedRuleProgressException(this);
    }
}
