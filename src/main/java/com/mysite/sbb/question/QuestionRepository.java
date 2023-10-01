package com.mysite.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface QuestionRepository extends JpaRepository<Question, Integer>  {

    Question findBySubject(String subject);

    Question findByContent(String content);

    Question findBySubjectAndContent(String subject, String content);

    @Modifying
    @Transactional
    @Query(value= "Set FOREIGN_KEY_CHECKS=0;",nativeQuery = true)
    void disableForeignKeyChecks();

    @Modifying
    @Transactional
    @Query(value= "Truncate Question",nativeQuery = true)
    void truncate();

    @Modifying
    @Transactional
    @Query(value= "Set FOREIGN_KEY_CHECKS=1;",nativeQuery = true)
    void enableForeignKeyChecks();
}
