package ru.skypro.exam.service;

import org.apache.coyote.BadRequestException;
import ru.skypro.exam.exception.NotEnoughQuestions;
import ru.skypro.exam.general.Question;

import java.util.ArrayList;
import java.util.List;

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public List<Question> getQuestions(int count) throws BadRequestException {
        List<Question> questions = new ArrayList<>();

        while (questions.size() < count) {
            Question question = questionService.getRandomQuestion();

            if (!questions.contains(question)) {
                questions.add(question);
            }
        }

        if (questions.size() < count) {
            throw new NotEnoughQuestions("Вопросов получено недостаточное количество");
        }
        return questions;
    }
}
