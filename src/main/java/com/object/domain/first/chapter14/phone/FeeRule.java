package com.object.domain.first.chapter14.phone;

import com.object.domain.first.chapter2.Money;

public class FeeRule {

    // 단위 요금
    private FeeCondition feeCondition;
    // 적용 조건
    private FeePerDuration feePerDuration;

    public FeeRule(FeeCondition feeCondition, FeePerDuration feePerDuration) {
        this.feeCondition = feeCondition;
        this.feePerDuration = feePerDuration;
    }

    public Money calculateFee(Call call) {
        return feeCondition.findTimeIntervals(call)
            .stream()
            .map(each -> feePerDuration.calculate(each))
            .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }
}
