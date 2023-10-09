package com.object.domain.first.chapter14.phone;

import com.object.domain.first.chapter2.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
