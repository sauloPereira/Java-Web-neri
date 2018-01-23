package com.aulaneri.model.service;

import java.util.List;

import com.aulaneri.model.model.CursoModel;

public interface CursoServiceInterface {

CursoModel salvarCurso(CursoModel cursoModel);
	
	void alterar(CursoModel cursoModel);
	
	void excluir(CursoModel cursoModel);
	
	List<CursoModel> getCursos();
	
}
