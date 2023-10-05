package com.object.domain.chapter12.grade;

import static java.util.stream.Collectors.joining;

import java.util.List;
import java.util.Optional;

public class GradeLecture extends Lecture {

    private List<Grade> grades;

    public GradeLecture(int pass, String title, List<Integer> scores, List<Grade> grades) {
        super(pass, title, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {
        return super.evaluate() + ", " + gradesStatistics();
    }

    private String gradesStatistics() {
        return grades.stream()
            .map(grade -> format(grade))
            .collect(joining(" "));
    }

    private String format(Grade grade) {
        return String.format("%s:%d", grade.getName(), gradeCount(grade));
    }

    private long gradeCount(Grade grade) {
        return getScores().stream()
            // 아! 생각해보니까 객체가 자신의 상태에 대한 책임을 지는 것인데, 이건 여기서 하는게 맞는듯 하다.
            // 만약 grade에서 score를 관리하면 grade가 score을 알아야 하기 떄문에
            // 아니라면 grade가 Lecture을 알아야 할 것 같다
            .filter(score -> grade.include(score))
            .count();
    }

    public double average(String gradeName) {
        Optional<Grade> firstGrade = grades.stream()
            .filter(each -> each.isName(gradeName))
            .findFirst();
        return firstGrade
            .map(grade -> gradeAverage(grade))
            .orElse(0d);
    }

    private double gradeAverage(Grade grade) {
        long sum = 0;
        long count = 0;
        for (Integer score : getScores()) {
            if (grade.include(score)) {
                sum += score;
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

//    public String getEvaluationMethod() {
//        return "Grade";
//    }
}
