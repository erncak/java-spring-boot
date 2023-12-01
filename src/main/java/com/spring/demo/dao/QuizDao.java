package com.spring.demo.dao;

import com.spring.demo.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  QuizDao extends JpaRepository<Quiz,Integer> {
}
