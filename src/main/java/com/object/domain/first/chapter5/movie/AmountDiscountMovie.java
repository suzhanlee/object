package com.object.domain.first.chapter5.movie;

import com.object.domain.first.chapter2.Money;
import com.object.domain.first.chapter5.discountcondition.DiscountCondition;
import java.time.Duration;

public class AmountDiscountMovie extends Movie{

    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration runningTime, Money fee,
        Money discountAmount,
        DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    protected Money calculateDiscountAmount() {
        return discountAmount;
    }
}
