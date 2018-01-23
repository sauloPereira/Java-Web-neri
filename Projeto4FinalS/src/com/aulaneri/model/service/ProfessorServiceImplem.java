package com.aulaneri.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.aulaneri.model.dao.ProfessorDaoInterface;
import com.aulaneri.model.model.ProfessorModel;

public class ProfessorServiceImplem implements ProfessorServiceInterface {
	
	
	//Exemplo utilizando @Inject para pegar dados da Interface.
	
	@Inject
	public ProfessorDaoInterface professorDaoInterface; 

	@Override
	@Transactional
	public ProfessorModel salvarProfessor(ProfessorModel professorModel) {
		
		return professorDaoInterface.salvarProfessor(professorModel);
	}

	@Override
	@Transactional
	public void alterar(ProfessorModel professorModel) {
		professorDaoInterface.alterar(professorModel);
		
	}

	@Override
	@Transactional
	public void excluir(ProfessorModel professorModel) {
		professorDaoInterface.excluir(professorModel);
		
	}

	@Override
	public List<ProfessorModel> getProfessor() {
		return professorDaoInterface.getProfessor();
	}
	
	

}
