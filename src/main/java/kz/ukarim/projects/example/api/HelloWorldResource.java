package kz.ukarim.projects.example.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("example")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayHello() {
        return Response.ok("Hello from UndertowJaxrs server").build();
    }

}