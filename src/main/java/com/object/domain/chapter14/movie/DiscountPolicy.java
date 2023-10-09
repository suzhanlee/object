package com.object.domain.chapter14.movie;

import com.object.domain.chapter2.Money;
import com.object.domain.chapter5.Screening;
import java.util.ArrayList;
import java.util.List;

// Composite 패턴의 Component
public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public void switchCondition(List<DiscountCondition> conditions) {
        this.conditions = conditions;
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        // getMovieFee() 로 변경하기
        return screening.getMovie().getFee();
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
