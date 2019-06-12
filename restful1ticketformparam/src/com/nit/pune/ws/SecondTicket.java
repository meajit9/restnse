package com.nit.pune.ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/st")
public class SecondTicket {
	/*@Path("/insertpath/{ticket_type}/{name}/{location}/{price}")
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
	}*/
	
	
	/*@Path("/form")
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String receiveTicketInfo(@FormParam("ticket_type") String type,
			@FormParam("name") String name,
			@FormParam("location") String location,
			@FormParam("price") String price
			)
	{
		System.out.println(type + "/n" + name + "/n" +location + "/n"+ price);
		return "<html><body bgcolor='#055' text='green'><h1>rest html success</h1></body></html>";
	}*/
	
	@Path("/query")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String receiveTicketInfo(@QueryParam("ticket_type") String type,
			@QueryParam("name") String name,
			@QueryParam("location") String location,
			@QueryParam("price") String price
			)
	{
		System.out.println(type + "/n" + name + "/n" +location + "/n"+ price);
		return "<result><status>success</status></result>";
	}

}
