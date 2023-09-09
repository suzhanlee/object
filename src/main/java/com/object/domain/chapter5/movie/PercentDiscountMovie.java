package com.object.domain.chapter5.movie;

import com.object.domain.chapter2.Money;
import com.object.domain.chapter5.discountcondition.DiscountCondition;
import java.time.Duration;

public class PercentDiscountMovie extends Movie {

    private double percent;

    public PercentDiscountMovie(String title, Duration runningTime, Money fee, double percent,
        DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.percent = percent;
    }

    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
