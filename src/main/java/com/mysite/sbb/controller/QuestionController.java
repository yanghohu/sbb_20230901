package com.mysite.sbb.controller;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuestionController {

    // @AutoWired 필드 주입
    @Autowired
    private  QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questionList = questionRepository.findAll();
        model.addAttribute("questionList",questionList);
        return "question_list";
    }
}
