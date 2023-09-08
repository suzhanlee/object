package com.object.domain.chapter2;

import com.object.domain.chapter2.discountpolicy.DefaultDiscountPolicy;
import com.object.domain.chapter2.discountpolicy.DiscountPolicy;
import java.time.Duration;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
//         할인할 금액을 계산할 책임이 Movie 에게 존재한다 -> 문제
//         책임의 위치를 결정하기 위해 조건문을 사용하는 것은 협력의 설계 측면에서 좋지 않은 선택이다.
//         항상 예외 케이스를 최소화하고, 일관성을 유지할 수 있는 방법을 선택하라!
//        if (defaultDiscountPolicy == null) {
//            return fee;
//        }

        // 할인할 금액을 계산할 책임이 DiscountPolicy의 자식 클래스에 존재한다.
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
