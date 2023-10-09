package com.object.domain.first.chapter14.phone;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);
}
