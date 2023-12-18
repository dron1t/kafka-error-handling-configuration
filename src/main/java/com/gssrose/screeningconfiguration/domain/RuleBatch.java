package com.gssrose.screeningconfiguration.domain;

import com.gssrose.screeningconfiguration.domain.entities.Rule;

import java.util.ArrayList;
import java.util.List;

public class RuleBatch extends AggregateRoot<Long> {

    private final List<Rule> rules = new ArrayList<Rule>();

    public RuleBatch(Long batchRuleId) {
        this.setId(batchRuleId);
    }

    public void addRules(List<Rule> rules) {
        
    }
}
