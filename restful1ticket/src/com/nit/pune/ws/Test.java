package com.nit.pune.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test/hello")
public class Test {
	
	@GET
	@Produces("application/text")
	public String hello()
	{
		
		return "First WebServices Jersey";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String hello1()
	{
		
		return "First WebServices Jersey";
	}

}
