package com.mysite.sbb.answer;

import com.mysite.sbb.question.Question;

import javax.persistence.*;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime creDateTime;

    @ManyToOne
    private Question question;

}
