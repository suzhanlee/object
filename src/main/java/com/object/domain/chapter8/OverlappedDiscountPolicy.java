package com.object.domain.chapter8;

import com.object.domain.chapter2.Money;
import com.object.domain.chapter4.DiscountCondition;
import com.object.domain.chapter5.Screening;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Composite 패턴의 Composite
public class OverlappedDiscountPolicy extends DiscountPolicy {

    private List<DiscountPolicy> discountPolicies = new ArrayList<>();

    public OverlappedDiscountPolicy(DiscountPolicy ... discountPolicies) {
        this.discountPolicies = Arrays.asList(discountPolicies);
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        Money result = Money.ZERO;
        for (DiscountPolicy each : discountPolicies) {
            result = result.plus(each.calculateDiscountAmount(screening));
        }
        return result;
    }
}
