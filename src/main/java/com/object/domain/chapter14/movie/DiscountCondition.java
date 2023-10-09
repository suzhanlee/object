package com.object.domain.chapter14.movie;

import com.object.domain.chapter5.Screening;

public interface DiscountCondition {


    boolean isSatisfiedBy(Screening screening);
}
