package com.object.domain.first.chapter5.discountcondition;

import com.object.domain.first.chapter5.Screening;

public class SequenceCondition implements DiscountCondition{

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }
}
