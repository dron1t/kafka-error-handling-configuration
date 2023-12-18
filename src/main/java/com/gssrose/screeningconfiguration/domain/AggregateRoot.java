package com.gssrose.screeningconfiguration.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AggregateRoot<T> {

    @Setter(AccessLevel.PROTECTED)
    private T id;

    @Setter(AccessLevel.PROTECTED)
    private long version;

    private boolean wasVersionAlreadyIncremented = false;

    protected void incrementVersion() {
        if (this.wasVersionAlreadyIncremented) {
            return;
        }
        this.version++;
    }

}
