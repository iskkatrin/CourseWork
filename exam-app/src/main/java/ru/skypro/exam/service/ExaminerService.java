package ru.skypro.exam.service;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;
import ru.skypro.exam.exception.NotEnoughQuestions;
import ru.skypro.exam.general.Question;

import java.util.List;

@Service
public interface ExaminerService {

    List<Question> getQuestions(int count) throws NotEnoughQuestions;
}
