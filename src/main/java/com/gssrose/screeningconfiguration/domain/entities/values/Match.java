package com.gssrose.screeningconfiguration.domain.entities.values;

import lombok.With;

@With
public record Match(int locationFrom, int locationTo, String text) { }
