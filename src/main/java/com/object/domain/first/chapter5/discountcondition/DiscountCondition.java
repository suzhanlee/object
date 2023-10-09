package com.object.domain.first.chapter5.discountcondition;

import com.object.domain.first.chapter5.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
