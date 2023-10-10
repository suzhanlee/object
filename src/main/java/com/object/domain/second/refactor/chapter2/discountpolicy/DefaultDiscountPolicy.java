package com.object.domain.second.refactor.chapter2.discountpolicy;

import com.object.domain.second.refactor.chapter2.Money;
import com.object.domain.second.refactor.chapter2.Screening;
import com.object.domain.second.refactor.chapter2.discountcondition.DiscountCondition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    // 인터페이스를 사용하여 코드 수정 없이 NoneDiscountPolicy의 calculateDiscountAmount도 호출 가능해짐
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
