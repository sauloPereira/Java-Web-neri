package com.aulaneri.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aulaneri.model.ProfessorModel;

@Path("/professores")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)

public class ProfessoresFacade {

	static List<ProfessorModel> listaProfessores = new ArrayList<ProfessorModel>();

	static {
		listaProfessores.add(new ProfessorModel(1, "Morgana Pereira Rodrigues", "morgana@email.com", "85 988181710"));
		listaProfessores.add(new ProfessorModel(2, "Saulo Pereira da Silva", "saulo@email.com", "85 988181710"));
		listaProfessores.add(new ProfessorModel(3, "Francisca Joelma Sousa Rodrigues", "joelma@email.com", "85 988181710"));
		listaProfessores.add(new ProfessorModel(4, "Morgana Khalisee Pereira Rodrigues", "khalisee@email.com", "85 988181710"));
		
	}
	
	@GET
	public List<ProfessorModel> getProfessores(){
		return listaProfessores;
	}
	
}
