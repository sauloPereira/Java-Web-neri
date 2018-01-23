package com.aulaneri.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//semple usar Implements serialivable para web

@XmlRootElement  //Gera xml, abilita uso para @GET/@post... de outras classes
@Entity
@Table(name="professor")
public class ProfessorModel implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)// Gera codigo automatico
	@Column(name="prof_codigo")
	Integer codigo;
	
	@Column(name="prof_nome", length = 50, nullable = false)
	String nome;
	
	@Column(name="prof_email", length = 50, nullable = true)
	String email;
	
	@Column(name="prof_fone", length = 15, nullable = false)
	String fone;
	
	
	public ProfessorModel() {
		
		
	}
	
	public ProfessorModel(Integer codigo, String nome, String email, String fone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	//ALT + SHIFT + S = gera Gets e Sets - 
	//hashCode = pesquisa de acordo com caracteres
	//equal = objetos iguais aos pesquisados.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfessorModel other = (ProfessorModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	

}
