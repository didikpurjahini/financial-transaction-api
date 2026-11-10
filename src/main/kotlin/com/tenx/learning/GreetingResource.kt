package com.tenx.learning

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces


@Path("/hello")
class GreetingResource {

    @GET
    @Produces("text/plain")
    fun hello() = "Hello from Quarkus REST"
}