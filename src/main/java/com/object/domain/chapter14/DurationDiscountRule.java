package com.object.domain.chapter14;

import com.object.domain.chapter2.Money;
import java.time.Duration;

public class DurationDiscountRule extends FixedFeePolicy {

    private Duration from;
    private Duration to;

    public DurationDiscountRule(Money amount, Duration seconds, Duration from, Duration to) {
        super(amount, seconds);
        this.from = from;
        this.to = to;
    }

//    public Money calculate(Call call) {
//        if (call.getDuration().compareTo(to) > 0) {
//            return Money.ZERO;
//        }
//
//        if (call.getDuration().compareTo(from) < 0) {
//            return Money.ZERO;
//        }
//
//        Phone phone = new Phone(null);
//        phone.call();
//    }
}
