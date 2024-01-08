package ru.skypro.exam.controller;

import org.springframework.web.bind.annotation.RestController;
import ru.skypro.exam.exception.NotEnoughQuestions;
import ru.skypro.exam.general.Question;
import ru.skypro.exam.service.ExaminerService;

import java.util.List;

@RestController
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    public List<Question> getQuestions(int amount) throws NotEnoughQuestions {
        return examinerService.getQuestions(amount);
    }
}
