package com.object.domain.chapter14.phone;

import com.object.domain.chapter2.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
