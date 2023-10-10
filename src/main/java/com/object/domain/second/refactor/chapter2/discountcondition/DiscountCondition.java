package com.object.domain.second.refactor.chapter2.discountcondition;

import com.object.domain.second.refactor.chapter2.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
