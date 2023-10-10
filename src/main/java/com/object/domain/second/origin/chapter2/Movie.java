package com.object.domain.second.origin.chapter2;

import com.object.domain.second.origin.chapter2.discountpolicy.DiscountPolicy;
import java.time.Duration;
import lombok.Getter;

public class Movie {

    private String title;
    private Duration runningTime;
    @Getter
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {
        // NoneDiscountPolicy을 주입하는 방식으로 예외 문제 해결
//        if (discountPolicy == null) {
//            return fee;
//        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
