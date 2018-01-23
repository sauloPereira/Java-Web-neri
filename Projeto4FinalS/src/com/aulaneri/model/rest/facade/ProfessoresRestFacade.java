package com.aulaneri.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aulaneri.model.model.ProfessorModel;
import com.aulaneri.model.service.ProfessorServiceInterface;


@Path("/professores")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})// Gerando mediaTypes para converção no browser dos dados
@Consumes({MediaType.APPLICATION_JSON})// usando dados.
public class ProfessoresRestFacade {

	/*
	//direto, sem uso do serviço
	@Inject
	private ProfessorDaoImplem professorDaoImplem;
	
	@GET
	public List<ProfessorModel> getProfessor() {
		return professorDaoImplem.getProfessor();
		
	}
	//========================================
	*/
	
	@Inject
	private ProfessorServiceInterface professorServiceInterface;
	
	@GET
	public List<ProfessorModel> getProfessor() {
		return professorServiceInterface.getProfessor();
		
	}
	
	@POST
	public ProfessorModel salvarProfessor(ProfessorModel professorModel) {
		return professorServiceInterface.salvarProfessor(professorModel);
	
	}
	
	@PUT
	public void atualizar(ProfessorModel professorModel) {
		professorServiceInterface.alterar(professorModel);
		
	}
	
	@DELETE
	@Path("/{codigo.professor}")
	public void excluir(@PathParam("codigo.professor") Integer codigoProfessor) {
		ProfessorModel professorModel = new ProfessorModel();
		professorModel.setCodigo(codigoProfessor);
		
		professorServiceInterface.excluir(professorModel);
		
	}
	
	
}
