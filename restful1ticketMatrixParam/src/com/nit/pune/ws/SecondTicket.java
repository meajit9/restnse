package com.nit.pune.ws;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/st")
public class SecondTicket {
	@Path("/matrix")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String receiveTicketInfo(@MatrixParam("ticket_type") String type,
			@MatrixParam("name") String name,
			@MatrixParam("location") String location,
			@MatrixParam("price") String price
			)
	{
		System.out.println(type + "/n" + name + "/n" +location + "/n"+ price);
		return "{\"status\",\"success\"}";
	}

}
