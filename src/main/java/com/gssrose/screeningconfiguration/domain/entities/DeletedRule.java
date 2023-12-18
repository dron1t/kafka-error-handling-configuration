package com.gssrose.screeningconfiguration.domain.entities;

import com.gssrose.screeningconfiguration.domain.exceptions.UnsupportedRuleProgressException;

public class DeletedRule extends Rule {
    public DeletedRule(PendingDeletionRule pendingDeletionRule) {
        super(pendingDeletionRule.getProfileId(), pendingDeletionRule.getMatch());
    }

    @Override
    public Rule progressSuccessfully() {
        throw new UnsupportedRuleProgressException(this);
    }

    @Override
    public Rule progressUnsuccessfully() {
        throw new UnsupportedRuleProgressException(this);
    }
}
