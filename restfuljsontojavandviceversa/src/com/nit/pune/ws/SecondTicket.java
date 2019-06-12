package com.nit.pune.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/st")
public class SecondTicket {
	@Path("/insertpath/{ticket_type}/{name}/{location}/{price}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String receiveTicketInfo(@PathParam("ticket_type") String type,
			@PathParam("name") String name,
			@PathParam("location") String location,
			@PathParam("price") String price
			)
	{
		System.out.println(type + "/n" + name + "/n" +location + "/n"+ price);
		return "ticket successfully received";
	}

}
