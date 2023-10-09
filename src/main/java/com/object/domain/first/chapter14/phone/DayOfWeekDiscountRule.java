package com.object.domain.first.chapter14.phone;

import com.object.domain.first.chapter2.Money;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountRule {

    // 필요한 요일 목록
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();
    // 단위 시간
    private Duration duration = Duration.ZERO;
    // 단위 요금
    private Money amount = Money.ZERO;

    public DayOfWeekDiscountRule(List<DayOfWeek> dayOfWeeks, Duration duration, Money amount) {
        this.dayOfWeeks = dayOfWeeks;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculate(DateTimeInterval interval) {
        if (dayOfWeeks.contains(interval.getFrom().getDayOfWeek())) {
            return amount.times((double) interval.duration().getSeconds() / duration.getSeconds());
        }

        return Money.ZERO;
    }
}
