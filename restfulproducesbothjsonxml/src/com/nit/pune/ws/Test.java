package com.nit.pune.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/produceboth")
public class Test {
	
	@GET
	@Path("/both")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student hello()
	{
		
		Student s = new Student();
        s.setAge("10");
        s.setName("JavaInterviewPoint");
        
        return s;
	}

}
