package com.object.domain.chapter12.grade;

public class Main {

    public static void main(String[] args) {

        Lecture lecture = new GradeLecture(0,"", null, null);
        // self 에서 부터 위로 올라간다!
        System.out.println(lecture.stats());
    }
}
