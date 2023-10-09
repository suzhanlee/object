package com.object.domain.first.chapter2.discountpolicy;

import com.object.domain.first.chapter2.discountcondition.DiscountCondition;
import com.object.domain.first.chapter2.Money;
import com.object.domain.first.chapter2.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

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
