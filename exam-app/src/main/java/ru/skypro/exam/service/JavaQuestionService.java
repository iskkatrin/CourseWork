package ru.skypro.exam.service;

import ru.skypro.exam.general.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class JavaQuestionService implements QuestionService {

    private List<Question> questions;

    public JavaQuestionService() {
        questions = new ArrayList<>();
    }

    @Override
    public void addQuestion(String Questions, String Answer) {

    }

    @Override
    public void removeQuestion(Question question) {

    }

    @Override
    public Collection<Question> getAllQuestions() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {

        Random random = new Random();
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }
}



