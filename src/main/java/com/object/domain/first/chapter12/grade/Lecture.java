package com.object.domain.first.chapter12.grade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

    private int pass;
    private String title;
    private List<Integer> scores = new ArrayList<>();

    public Lecture(int pass, String title, List<Integer> scores) {
        this.pass = pass;
        this.title = title;
        this.scores = scores;
    }

    public double average() {
        long sum = 0;
        long count = 0;
        for (Integer score : scores) {
            sum += score;
            count++;
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public List<Integer> getScores() {
        // 컬렉션에서 리스트에 데이터를 추가한 뒤 더 이상 데이터 삭제, 추가를 막기 위해서 사용
        return Collections.unmodifiableList(scores);
    }

    public String evaluate() {
        return String.format("Pass:%d Fail%&d", passCount(), failCount());
    }

    public long passCount() {
        return scores.stream().filter(score -> score >= pass).count();
    }

    public long failCount() {
        return scores.size() - passCount();
    }

    public String stats() {
        // getEvaluationMethod 는 현재 클래스의 메서드를 호출하는 것이 아닌 현재 객체에게
        // getEvaluationMethod 메시지를 전송하는 것이다.
        return String.format("Title: %s, Evaluation Method: %s", title, this.getEvaluationMethod());
    }

    public String getEvaluationMethod() {
        return "Pass or Fail";
    }
}
