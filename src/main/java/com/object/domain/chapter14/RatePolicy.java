package com.object.domain.chapter14;

import com.object.domain.chapter2.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
