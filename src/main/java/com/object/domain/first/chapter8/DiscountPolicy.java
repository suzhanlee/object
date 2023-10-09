package com.object.domain.first.chapter8;

import com.object.domain.first.chapter2.Money;
import com.object.domain.first.chapter4.DiscountCondition;
import com.object.domain.first.chapter5.Screening;
import java.util.ArrayList;
import java.util.List;

// Composite 패턴의 Component
public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public void switchCondition(List<DiscountCondition> conditions) {
        this.conditions = conditions;
    }

    public Money calculateDiscountAmount(Screening screening) {
        // 구현하지 않았다
        return null;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
