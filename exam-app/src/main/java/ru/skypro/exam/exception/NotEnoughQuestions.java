package ru.skypro.exam.exception;

public class NotEnoughQuestions extends RuntimeException {
    public NotEnoughQuestions(String message) {
        super(message);
    }
}
