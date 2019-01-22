package com.qa.business.service;

public interface QuizService {

	String getQuiz(Long id);
	String addQuiz(String question, String answer);
	String deleteQuiz(Long id);
	
	
	
}
