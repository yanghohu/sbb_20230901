package com.mysite.sbb.question;

import com.mysite.sbb.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getList() {
        List<Question> questionList = questionRepository.findAll();
        return questionList;
    }

    public Question getQuestion(Integer id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("no %d question not found".formatted(id)));
    }
}
