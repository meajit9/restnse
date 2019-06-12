package com.nit.pune.ws;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

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
	
	
	 
	
	
	//we can retrieve query parameters using @Context annotation also
	//@Context UriInfo info has several methods to retrieve query parameters
	//getQueryParameters().getFirst()
	/*@Path("/query")
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	public String receiveTicketInfo(@QueryParam("ticket_type") String type,
			@QueryParam("name") String name,
			@QueryParam("location") String location,
			@QueryParam("price") String price
			)
	{
		System.out.println(type + "/n" + name + "/n" +location + "/n"+ price);
		return "<result><status>success</status></result>";
	}*/
	
	@Path("/query")
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	public Response getQueryParameters(@Context UriInfo uri)
	{
		String parameter1=uri.getQueryParameters().getFirst("ticket_type");
		List parameter2=uri.getQueryParameters().get("name");
		String output = "Parameter1 :"+parameter1+" Parameter2 : "+parameter2.toString();
		
		
		return Response.status(200).entity(output).build();
	}
	
	

}
