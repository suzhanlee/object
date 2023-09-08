package com.object.domain.chapter2.discountpolicy;

import com.object.domain.chapter2.Money;
import com.object.domain.chapter2.Screening;
import com.object.domain.chapter2.discountcondition.DiscountCondition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    // Template Method Pattern
    abstract protected Money getDiscountAmount(Screening screening);
}
