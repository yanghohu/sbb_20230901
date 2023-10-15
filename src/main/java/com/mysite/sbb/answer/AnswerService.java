package com.mysite.sbb.answer;

import com.mysite.sbb.DataNotFoundException;
import com.mysite.sbb.question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreDateTime(LocalDateTime.now());
        question.addAnswer(answer);
        answerRepository.save(answer);
    }
    public Answer getAnswer(Integer id) {
        return answerRepository.findById(id).orElseThrow(() -> new DataNotFoundException("answer not found"));
    }
}
