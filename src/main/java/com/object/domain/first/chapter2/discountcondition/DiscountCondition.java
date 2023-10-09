package com.object.domain.first.chapter2.discountcondition;

import com.object.domain.first.chapter2.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
