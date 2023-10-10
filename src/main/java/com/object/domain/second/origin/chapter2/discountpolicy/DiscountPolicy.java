package com.object.domain.second.origin.chapter2.discountpolicy;

import com.object.domain.second.origin.chapter2.Money;
import com.object.domain.second.origin.chapter2.Screening;
import com.object.domain.second.origin.chapter2.discountcondition.DiscountCondition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        // 이 코드로 인해 NoneDiscountPolicy의 getDiscountAmount 메서드가 어떤 값을
        // 반환하더라도 상관없다. -> 할인 조건이 없을 경우 getDiscountPolicy를 호출하지 않기 때문
        // 따라서 코드의 수정이 필요하다.
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
