package com.nit.pune.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/produceboth")
public class Test {
	
	@GET
	@Path("/getboth")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student hello()
	{
		
		Student s = new Student();
        s.setAge("10");
        s.setName("JavaInterviewPoint");
        
        return s;
	}

	/*@POST
	@Path("/postboth")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student hello(Employee employee)
	{
		
		Student s = new Student();
        s.setAge("10");
        s.setName("JavaInterviewPoint");
        
        return s;
	}*/
}
