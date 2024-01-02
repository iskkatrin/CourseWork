package ru.skypro.exam.general;

public class Question {
    String Questions;
    String Answer;

    public String getQuestions() {
        return Questions;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Questions='" + Questions + '\'' +
                ", Answer='" + Answer + '\'' +
                '}';
    }

    public Question(String questions, String answer) {
        Questions = questions;
        Answer = answer;

    }
}
