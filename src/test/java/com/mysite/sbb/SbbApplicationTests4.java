package com.mysite.sbb;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class SbbApplicationTests4 {

    @Autowired
    private QuestionRepository questionRepository;
    @Test
    void contextLoads() {
        Question q = questionRepository.findBySubject("sbb가 무엇인가요?");
    }
}
