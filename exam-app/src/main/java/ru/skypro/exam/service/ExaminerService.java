package ru.skypro.exam.service;

import org.apache.coyote.BadRequestException;
import ru.skypro.exam.general.Question;

import java.util.List;

public interface ExaminerService {

    List<Question> getQuestions(int count) throws BadRequestException;
}
