package com.aulaneri.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.aulaneri.model.dao.CursoDaoInterface;
import com.aulaneri.model.model.CursoModel;

public class CursoServiceImplem implements CursoServiceInterface {
	
	
	//Exemplo utilizando @Inject para pegar dados da Interface.
	
	@Inject
	public CursoDaoInterface cursoDaoInterface; 

	@Override
	@Transactional
	public CursoModel salvarCurso(CursoModel cursoModel) {
		
		return cursoDaoInterface.salvarCurso(cursoModel);
	}

	@Override
	@Transactional
	public void alterar(CursoModel cursoModel) {
		cursoDaoInterface.alterar(cursoModel);
		
	}

	@Override
	@Transactional
	public void excluir(CursoModel cursoModel) {
		cursoDaoInterface.excluir(cursoModel);
		
	}

	@Override
	public List<CursoModel> getCursos() {
		return cursoDaoInterface.getCursos();
	}
	
	

}
