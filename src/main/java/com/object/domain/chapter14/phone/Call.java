package com.object.domain.chapter14.phone;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;

public class Call {

//    private LocalDateTime from;
//    private LocalDateTime to;

    @Getter
    private DateTimeInterval interval;

    public Call(DateTimeInterval interval) {
        this.interval = interval;
    }

    public Duration getDuration() {
        return interval.duration();
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

