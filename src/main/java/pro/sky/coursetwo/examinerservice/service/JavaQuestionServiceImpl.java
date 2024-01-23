package pro.sky.coursetwo.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.coursetwo.examinerservice.domain.Question;
import pro.sky.coursetwo.examinerservice.exception.AlreadyQuestionException;
import pro.sky.coursetwo.examinerservice.exception.NoObjectException;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {

    private final Set<Question> questions;

    public JavaQuestionServiceImpl() {
        this.questions = new HashSet<>();
    }

    @Override
    public Question add(String question, String answer) {
        Question questionNew = new Question(question, answer);
        return add(questionNew);

    }

    @Override
    public Question add(Question question) {
        if (questions.contains(question)) {
            throw new AlreadyQuestionException();
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
            return question;
        }
        throw new NoObjectException();
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questions);
    }

    @Override
    public Question getRandomQuestion() {
        int size = questions.size();
        int randIdx = new Random().nextInt(size);
        int currIdx = 0;
        for (Question question : questions) {
            if (currIdx == randIdx) {
                return question;
            }
            currIdx++;
        }
        return null;
    }
}
