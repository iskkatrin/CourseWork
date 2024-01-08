package ru.skypro.exam.service;

import org.springframework.stereotype.Service;
import ru.skypro.exam.general.Question;

import java.util.Collection;

@Service
public interface QuestionService {
    void addQuestion(String Questions, String Answer);

    void removeQuestion(Question question);

    Collection<Question> getAllQuestions();

    Question getRandomQuestion();
}