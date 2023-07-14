package pro.sky.coursetwo.examinerservice.service;

import pro.sky.coursetwo.examinerservice.domain.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestion(int amount);
}
