package com.object.domain.first.chapter14.movie;

import com.object.domain.first.chapter5.Screening;

public interface DiscountCondition {


    boolean isSatisfiedBy(Screening screening);
}
