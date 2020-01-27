package com.airhacks.restt;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ejb.SimpleEJB;

@Path("hello")
public class HelloRest {
	@EJB
	private SimpleEJB simpleEJB;
	
	@GET
	public String hello() {
		return simpleEJB.chamada();
	}

}