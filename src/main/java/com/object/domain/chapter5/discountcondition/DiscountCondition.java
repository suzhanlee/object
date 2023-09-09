package com.object.domain.chapter5.discountcondition;

import com.object.domain.chapter5.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
