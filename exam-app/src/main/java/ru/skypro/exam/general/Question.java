package ru.skypro.exam.general;

import java.util.Objects;

public class Question {
    String questions;
    String answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return Objects.equals(getQuestions(), question.getQuestions()) && Objects.equals(getAnswer(), question.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestions(), getAnswer());
    }

    public String getQuestions() {
        return questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestions(String questions) {
        questions = questions;
    }

    public void setAnswer(String answer) {
        answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Questions='" + questions + '\'' +
                ", Answer='" + answer + '\'' +
                '}';
    }

    public Question(String questions, String answers) {
        questions = questions;
        answer = answers;
    }
}
