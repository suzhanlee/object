package com.object.domain.second.origin.chapter2.discountpolicy;

import com.object.domain.second.origin.chapter2.Money;
import com.object.domain.second.origin.chapter2.Screening;
import com.object.domain.second.origin.chapter2.discountcondition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
