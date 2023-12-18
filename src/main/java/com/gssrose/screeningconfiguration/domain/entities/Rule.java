package com.gssrose.screeningconfiguration.domain.entities;

import com.gssrose.screeningconfiguration.domain.entities.values.Match;
import com.gssrose.screeningconfiguration.domain.entities.values.ProfileId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Rule {

    protected final ProfileId profileId;
    protected final Match match;

    public abstract Rule progressSuccessfully();

    public abstract Rule progressUnsuccessfully();
}
