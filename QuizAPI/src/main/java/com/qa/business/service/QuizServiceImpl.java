package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.QuizRepository;

public class QuizServiceImpl implements QuizService{


	@Inject
	private QuizRepository repo;

	public Long getQuestion() {
		return repo.getQuestion();
	}

	public String addQuestion(String question, String answer) {
		return repo.createQuestion(question, answer);
	}

	public String deleteQuestion(Long id) {
		return repo.deleteQuestion(id);
	}

	public void setRepo(QuizRepository repo) {
		this.repo = repo;
	}

}


