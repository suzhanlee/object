package com.object.domain.chapter5.movie;

import com.object.domain.chapter2.Money;
import java.time.Duration;

public class NoneDiscountMovie extends Movie{

    public NoneDiscountMovie(String title, Duration runningTime, Money fee) {
        super(title, runningTime, fee);
    }

    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
