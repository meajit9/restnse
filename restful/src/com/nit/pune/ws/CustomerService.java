package com.nit.pune.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/createjson")
public class CustomerService {

	@POST
    @Path("/post")
    @Consumes("application/json")
    public Response createCustomerJSON(Customer customer)
    {
        String result = "Saved Customer : " + customer;
        System.out.println(customer.getName());
        return Response.status(200).entity(customer).build();
        
    }
}
