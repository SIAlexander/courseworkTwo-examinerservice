package pro.sky.coursetwo.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.coursetwo.examinerservice.domain.Question;
import pro.sky.coursetwo.examinerservice.exception.InvalidQuestionException;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService service;

    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        Set<Question> questionCollection = new HashSet<>();

        if (amount > service.getAll().size()) {
            throw new InvalidQuestionException();
        }

        while (questionCollection.size() != amount) {
            questionCollection.add(service.getRandomQuestion());
        }

        return Collections.unmodifiableCollection(questionCollection);
    }
}
