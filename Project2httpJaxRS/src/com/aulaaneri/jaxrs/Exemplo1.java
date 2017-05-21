package com.aulaaneri.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/exemplowsrs")
public class Exemplo1 {

	@GET
	public String executaGet(){
		return "GET executado!";
	}
	@POST
	public String executaPost(){
		return "POST executado!";
	}
	
}
