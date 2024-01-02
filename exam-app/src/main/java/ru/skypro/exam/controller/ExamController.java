package ru.skypro.exam.controller;

import org.apache.coyote.BadRequestException;
import ru.skypro.exam.general.Question;
import ru.skypro.exam.service.ExaminerService;

import java.util.List;

public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    public List<Question> getQuestions(int amount) throws BadRequestException {
        return examinerService.getQuestions(amount);
    }
}
