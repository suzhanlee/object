package com.object.domain.chapter2;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    // 영화 기본 요금 반환
    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    // private 접근 제어자로 구현을 감춘다!
    private Money calculateFee(int audienceCount) {
        // "Screening이 Movie 의 calculateMovieFee 라는 메소드를 호출하는 것이 아닌,
        // Screening이 Movie 에게 calculateMovieFee 라는 메시지를 전송한다" 라고 말하는 것이 정확하다!
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
