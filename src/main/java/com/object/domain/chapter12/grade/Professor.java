package com.object.domain.chapter12.grade;

public class Professor {

    private String name;
    private Lecture lecture;

    public Professor(String name, Lecture lecture) {
        this.name = name;
        this.lecture = lecture;
    }

    public String compileStatistics() {
        return String.format("[%s] %s - Avg: %.1f", name, lecture.evaluate(), lecture.average());
    }



}
