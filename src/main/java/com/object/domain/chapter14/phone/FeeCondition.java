package com.object.domain.chapter14.phone;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);
}
