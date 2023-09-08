package com.object.domain.chapter2.discountpolicy;

import com.object.domain.chapter2.discountcondition.DiscountCondition;
import com.object.domain.chapter2.Money;
import com.object.domain.chapter2.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

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
