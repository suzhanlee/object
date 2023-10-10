package com.object.domain.second.refactor.chapter2.discountpolicy;

import com.object.domain.second.refactor.chapter2.Money;
import com.object.domain.second.refactor.chapter2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

//    @Override
//    protected Money getDiscountAmount(Screening screening) {
//        return Money.ZERO;
//    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
