package com.object.domain.chapter14;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {

//    private LocalDateTime from;
//    private LocalDateTime to;

    private DateTimeInterval interval;

    public Call(DateTimeInterval interval) {
        this.interval = interval;
    }

    public Duration getDuration() {
        return interval.getDuration();
    }

    public LocalDateTime getFrom() {
        return interval.getFrom();
    }

    public LocalDateTime getTo() {
        return interval.getTo();
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }
}

