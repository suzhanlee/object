package com.object.domain.second.origin.chapter2.discountpolicy;

import com.object.domain.second.origin.chapter2.Money;
import com.object.domain.second.origin.chapter2.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
