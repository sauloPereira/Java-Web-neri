package com.aulaneri.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aulaneri.model.ProfessorModel;

@Path("/professores")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})// Gerando mediaTypes para converção no browser dos dados
@Consumes({MediaType.APPLICATION_JSON})// usando dados.
public class ProfessoresFacade {

	static List<ProfessorModel> listaProfessores = new ArrayList<ProfessorModel>();
	
	static {
		listaProfessores.add(new ProfessorModel
				(1, "Morgana Pereira Rodrigues", "morgana@email.com", "85 988181710"));
		listaProfessores.add(new ProfessorModel
				(2, "Saulo Pereira da Silva", "saulo@email.com", "85 988181710"));
		listaProfessores.add(new ProfessorModel
				(3, "Francisca Joelma Sousa Rodrigues", "joelma@email.com", "85 988181710"));
		listaProfessores.add(new ProfessorModel
				(4, "Morgana Khalisee Pereira Rodrigues", "khalisee@email.com", "85 988181710"));
		
	}
	
	@GET
	public List<ProfessorModel> getProfessores() {
		return listaProfessores;
		
	}
	
	@POST
	public ProfessorModel salvar(ProfessorModel professor) {
		System.out.println("@POST Salvar");
		System.out.println("Código " + professor.getCodigo());
		System.out.println("Nome " + professor.getNome());
		System.out.println("E-mail " + professor.getEmail());
		System.out.println("Fone " + professor.getFone());
		
		listaProfessores.add(professor);
		return professor;
	}
	
	@PUT
	public void atualizar(ProfessorModel professor) {
		System.out.println("@PUT Alterar");
		System.out.println("Código " + professor.getCodigo());
		System.out.println("Nome " + professor.getNome());
		System.out.println("E-mail " + professor.getEmail());
		System.out.println("Fone " + professor.getFone());
		
		listaProfessores.remove(professor);
		listaProfessores.add(professor);
		
	}
	
	@DELETE
	@Path("/{codigoProfessor}")
	public void excluir(@PathParam("codigoProfessor") Integer codigoProfessor) {
		System.out.println("@DELETE excluir");
		
		ProfessorModel professor = new ProfessorModel();
		professor.setCodigo(codigoProfessor);
		
		listaProfessores.remove(professor);
		
	}
	
}
