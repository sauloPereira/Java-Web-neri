package com.aulaneri.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.aulaneri.model.model.ProfessorModel;

public class ProfessorDaoImplem implements ProfessorDaoInterface {
	
	@PersistenceContext(unitName="Projeto4FinalSPersistenceUnit")
	private EntityManager entityManager;

	@Override
	public ProfessorModel salvarProfessor(ProfessorModel professorModel) {
		entityManager.persist(professorModel);
		return professorModel;
	}

	@Override
	public void alterar(ProfessorModel professorModel) {
		ProfessorModel professorModelMerge = entityManager.merge(professorModel);
		entityManager.persist(professorModelMerge);
		
	}

	@Override
	public void excluir(ProfessorModel professorModel) {
		ProfessorModel professorModelMerge = entityManager.merge(professorModel);
		entityManager.remove(professorModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProfessorModel> getProfessor() {
		Query query = entityManager.createQuery("from ProfessorModel");
		return query.getResultList();
	}

}
