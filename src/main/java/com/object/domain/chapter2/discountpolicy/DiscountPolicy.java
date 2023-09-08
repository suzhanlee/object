package com.object.domain.chapter2.discountpolicy;

import com.object.domain.chapter2.Money;
import com.object.domain.chapter2.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
