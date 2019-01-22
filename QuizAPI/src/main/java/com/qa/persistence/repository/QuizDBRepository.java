package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.persistence.domain.Quiz;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default

public class QuizDBRepository implements QuizRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	@Transactional(REQUIRED)
	public String createQuiz(String quest, String ans) {
		Quiz anQuiz = util.getObjectForJSON(quest,ans, Quiz.class);
		manager.persist(anQuiz);
		return "{\"message\": \"Quiz has been sucessfully added\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteQuiz(Long id) {
		quiz quizInDB = findQuiz(id);
		if (QuizInDB != null) {
			manager.remove(quizInDB);
		}
		return "{\"message\": \"Question sucessfully deleted\"}";
	}
	
	
	
	
	
}
