package org.acme.rest

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage
import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/casas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class CasaResource {

    @Inject
    private val casaService:CasaService? = null

    @GET
    fun list(): CompletionStage<List<Casa>> = CompletableFuture.supplyAsync{ casaService?.list() }
}