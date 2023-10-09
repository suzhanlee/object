package com.object.domain.first.chapter14.phone;

import com.object.domain.first.chapter2.Money;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TimeOfDayDiscountPolicy extends BasicRatePolicy {

    // 시작 시간
    private List<LocalTime> starts = new ArrayList<>();
    // 종료 시간
    private List<LocalTime> ends = new ArrayList<>();
    // 단위 시간
    private List<Duration> durations = new ArrayList<>();
    // 단위 요금
    private List<Money> amounts = new ArrayList<>();

    @Override
    protected Money calculateCallFee(Call call) {
        Money result = Money.ZERO;

        for (DateTimeInterval interval : call.splitByDay()) {
            for (int loop = 0; loop < starts.size(); loop++) {
                result.plus(amounts.get(loop).times(
                    (double) Duration.between(from(interval, starts.get(loop)),
                        to(interval, ends.get(loop))).getSeconds()
                        / durations.get(loop).getSeconds()
                ));
            }
        }

        return result;
    }

    private LocalTime from(DateTimeInterval interval, LocalTime from) {
        return interval.getFrom().toLocalTime().isBefore(from) ?
            from :
            interval.getFrom().toLocalTime();
    }

    private LocalTime to(DateTimeInterval interval, LocalTime to) {
        return interval.getTo().toLocalTime().isAfter(to) ?
            to :
            interval.getTo().toLocalTime();
    }
}
