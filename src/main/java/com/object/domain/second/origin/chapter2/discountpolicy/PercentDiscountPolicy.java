package com.object.domain.second.origin.chapter2.discountpolicy;

import com.object.domain.second.origin.chapter2.Money;
import com.object.domain.second.origin.chapter2.Screening;
import com.object.domain.second.origin.chapter2.discountcondition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
