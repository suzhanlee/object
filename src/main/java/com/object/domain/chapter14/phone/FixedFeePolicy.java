package com.object.domain.chapter14.phone;

import com.object.domain.chapter2.Money;
import java.time.Duration;

public class FixedFeePolicy extends BasicRatePolicy{

    private Money amount;
    private Duration seconds;

    public FixedFeePolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times((double) call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
