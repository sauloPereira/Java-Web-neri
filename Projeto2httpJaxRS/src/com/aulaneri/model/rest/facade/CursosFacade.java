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

import com.aulaneri.model.CursoModel;
import com.aulaneri.model.ProfessorModel;

@Path("/cursos")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})// Gerando mediaTypes para converção no browser dos dados
@Consumes({MediaType.APPLICATION_JSON})// usando dados.
public class CursosFacade {

	static List<CursoModel> listaCursos = new ArrayList<CursoModel>();
	
	static {
		listaCursos.add(new CursoModel
				(1, "Java Web", "Seg e Quar / 19hs", new ProfessorModel
						(1, "Morgana Pereira Rodrigues", "morgana@email.com", "85 988181710")));
		listaCursos.add(new CursoModel
				(2, "C#", "Ter e Qui / 20hs", new ProfessorModel
						(2, "Saulo Pereira da Silva", "saulo@email.com", "85 988181710")));
		listaCursos.add(new CursoModel
				(3, "Unity", "Sex / 19hs", new ProfessorModel
						(3, "Francisca Joelma Sousa Rodrigues", "joelma@email.com", "85 988181710")));
		listaCursos.add(new CursoModel
				(4, "HTML / CSS", "Sab / 09hs", new ProfessorModel
						(4, "Morgana Khalisee Pereira Rodrigues", "khalisee@email.com", "85 988181710")));
		
	}
	
	@GET
	public List<CursoModel> getCursos() {
		return listaCursos;
		
	}
	
	@POST
	public CursoModel salvar(CursoModel curso) {
		System.out.println("@POST Salvar");
		/*System.out.println("Código " + curso.getCodigo());
		System.out.println("Nome " + curso.getNome());
		System.out.println("Dias / Hórarios " + curso.getDiashorarios());
		*///System.out.println("Professor " + ProfessorModel.????);
		
		//listaCursos.add(curso);
		return curso;
	}
	
	@PUT
	public void atualizar(CursoModel curso) {
		/*System.out.println("@POST Salvar");
		System.out.println("Código " + curso.getCodigo());
		System.out.println("Nome " + curso.getNome());
		System.out.println("Dias / Hórarios " + curso.getDiashorarios());
		*///System.out.println("Professor " + ProfessorModel.????);
		
		listaCursos.remove(curso);
		listaCursos.add(curso);
		
	}
	
	@DELETE
	@Path("/{codigoCurso}")
	public void excluir(@PathParam("codigoCurso") Integer codigoCurso) {
		System.out.println("@DELETE excluir");
		
		CursoModel curso = new CursoModel();
		curso.setCodigo(codigoCurso);
		
		listaCursos.remove(curso);
		
	}
	
}
