package org.acme.rest

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CasaService {

    fun list() = listOf(Casa("Rua felice Tosi",200L))
}