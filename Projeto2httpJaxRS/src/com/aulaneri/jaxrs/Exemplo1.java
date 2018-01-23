package com.aulaneri.jaxrs;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/exemplowsrs")
public class Exemplo1 {
	
	//CTRL + SHIFT + O = importa bibliotecas
	@GET
	public String executaGet(){
		return "Tutorial Neri, executou GET."; 
	}
	
	@POST
	public String executaPost(){
		return "Tutorial Neri, executou POST."; 
	}

		
}
