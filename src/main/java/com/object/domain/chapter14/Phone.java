package com.object.domain.chapter14;

import com.object.domain.chapter2.Money;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Phone {

    @Getter
    private List<Call> calls = new ArrayList<>();
    private RatePolicy ratePolicy;

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }
}
