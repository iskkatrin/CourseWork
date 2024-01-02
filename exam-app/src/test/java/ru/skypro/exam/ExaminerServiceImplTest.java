package ru.skypro.exam;

import org.apache.coyote.BadRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.skypro.exam.general.Question;
import ru.skypro.exam.service.ExaminerService;
import ru.skypro.exam.service.ExaminerServiceImpl;
import ru.skypro.exam.service.QuestionService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ExaminerServiceImplTest {
    private QuestionService questionService;
    private ExaminerService examinerService;

    @BeforeEach
    void setUp() {
        questionService = mock(QuestionService.class);
        examinerService = new ExaminerServiceImpl(questionService);
    }

    @Test
    void getQuestions_ShouldReturnListOfQuestions_WhenEnoughQuestionsAvailable() throws BadRequestException {
        Question question1 = new Question("Question 1");
        Question question2 = new Question("Question 2");
        when(questionService.getRandomQuestion()).thenReturn(question1, question2);

        List<Question> result = examinerService.getQuestions(2);

        assertEquals(Arrays.asList(question1, question2), result);
        verify(questionService, times(2)).getRandomQuestion();
    }

    @Test
    void getQuestions_ShouldThrowBadRequestException_WhenNotEnoughQuestionsAvailable() {

        when(questionService.getRandomQuestion()).thenReturn(new Question("Question 1"));

        assertThrows(BadRequestException.class, () -> examinerService.getQuestions(2));
        // Проверка, что метод getRandomQuestion() был вызван как минимум дважды у questionService
        verify(questionService, atLeast(2)).getRandomQuestion();
    }
}