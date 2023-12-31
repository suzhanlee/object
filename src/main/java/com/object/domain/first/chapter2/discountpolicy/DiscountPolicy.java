package com.object.domain.first.chapter2.discountpolicy;

import com.object.domain.first.chapter2.Money;
import com.object.domain.first.chapter2.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
