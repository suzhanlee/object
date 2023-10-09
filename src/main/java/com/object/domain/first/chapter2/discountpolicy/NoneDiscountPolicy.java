package com.object.domain.first.chapter2.discountpolicy;

import com.object.domain.first.chapter2.Money;
import com.object.domain.first.chapter2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    // 이처럼 인터페이스를 사용해 확장하면, 비즈니스 로직을 수정하지 않고,
    // 확장을 통해 기능을 추가할 수 있다.
//    @Override
//    protected Money getDiscountAmount(Screening screening) {
//        return Money.ZERO;
//    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
