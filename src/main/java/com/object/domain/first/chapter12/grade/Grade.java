package com.object.domain.first.chapter12.grade;

import lombok.Getter;

public class Grade {

    @Getter
    private String name;
    private int upper, lower;

    private Grade(String name, int upper, int lower) {
        this.name = name;
        this.upper = upper;
        this.lower = lower;
    }

    public boolean isName(String name) {
        return this.name.equals(name);
    }

    public boolean include(int score) {
        return score >= lower && score <= upper;
    }
}
