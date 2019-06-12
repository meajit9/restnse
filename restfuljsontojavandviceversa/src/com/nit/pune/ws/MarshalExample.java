package com.nit.pune.ws;

import javax.ws.rs.client.Client;

import org.glassfish.jersey.client.ClientResponse;

public class MarshalExample {
	public static void main(String args[])
    {
	try
    {   
        Client client = Client.create();
        WebResource resource = client
                .resource("http://localhost:8080/RESTfulExample/rest/createjson/get?username=javainterviewpoint&id=1");
        ClientResponse response = resource.accept("application/json")
                .get(ClientResponse.class);
        if (response.getStatus() != 200) {
               throw new RuntimeException("Failed : HTTP error code : "
                + response.getStatus());
            }
     
            String output = response.getEntity(String.class);
     
            System.out.println("<<<< Generating JSON Output >>>");
            System.out.println(output);
 
      } catch (Exception e) {
 
        e.printStackTrace();
 
      }
    
}
}
