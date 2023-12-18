package com.gssrose.screeningconfiguration.domain.entities;

import com.gssrose.screeningconfiguration.domain.entities.values.Match;
import com.gssrose.screeningconfiguration.domain.entities.values.ProfileId;


public class PendingActivationRule extends Rule {

    public PendingActivationRule(ProfileId profileId, Match match) {
        super(profileId, match);
    }

    public PendingActivationRule(ActivationFailedRule activationFailedRule) {
        this(activationFailedRule.getProfileId(), activationFailedRule.getMatch());
    }

    @Override
    public Rule progressSuccessfully() {
        return new ActiveRule(this);
    }

    @Override
    public Rule progressUnsuccessfully() {
        return new ActivationFailedRule(this);
    }
}
