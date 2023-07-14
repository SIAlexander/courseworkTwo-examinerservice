package pro.sky.coursetwo.examinerservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.coursetwo.examinerservice.domain.Question;
import pro.sky.coursetwo.examinerservice.exception.InvalidQuestionException;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    private final Collection<Question> QUESTION = Arrays.asList(
            new Question("one_question", "one_answer"),
            new Question("two_question", "two_answer")
    );

    @Mock
    JavaQuestionServiceImpl javaQuestionService;

    @InjectMocks
    ExaminerServiceImpl examinerService;


    @BeforeEach
    void setUp() {
        when(javaQuestionService.getAll()).thenReturn(QUESTION);
    }


    @Test
    void getQuestion() {
        assertThrows(InvalidQuestionException.class, () -> examinerService.getQuestion(3));
        assertEquals(javaQuestionService.getAll().size(), 2);
    }
}
