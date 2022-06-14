package it.html.tutorial.library.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class JerseyHelloWorldExample {
	@GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
}
