package com.object.domain.chapter2.discountcondition;

import com.object.domain.chapter2.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
