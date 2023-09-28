package com.mysite.sbb;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SbbApplicationTests6 {

    @Autowired
    private QuestionRepository questionRepository;
    @Test
    void testJpa() {
        Question q = questionRepository.findBySubjectAndContent("sbb가 무엇인가요?","sbb에 대해서 알고 싶습니다.");
    }

}
