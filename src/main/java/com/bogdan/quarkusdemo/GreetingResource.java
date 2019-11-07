package com.bogdan.quarkusdemo;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

  @Inject
  private GreetingService greetingService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/greeting/{name}")
  public String greeting(@PathParam String name) {
    return greetingService.greeting(name);
  }
}