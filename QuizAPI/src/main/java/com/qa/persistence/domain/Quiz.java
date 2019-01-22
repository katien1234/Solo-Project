package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long questionId;
	private String question;
	private String answer;
	
	public Quiz() {
		
	}
	
	public Quiz(Long questionId, String question, String answer) {
		this.questionId = questionId;
		this.setQuiz(question);
		this.setAnswer(answer);
	}

	public Long getQuizId() {
		return questionId;
	}
	
	
	public String getQuiz() {
		return question;
	}

	public void setQuiz(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}

