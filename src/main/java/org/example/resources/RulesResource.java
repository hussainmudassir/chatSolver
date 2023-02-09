package org.example.resources;

import com.codahale.metrics.annotation.Timed;
import org.example.models.Rule;
import org.example.repositories.RulesRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rules")
@Produces(MediaType.APPLICATION_JSON)
public class RulesResource {

    private final RulesRepository rulesRepository;

    public RulesResource(RulesRepository rulesRepository) {
        this.rulesRepository = rulesRepository;
    }

    @GET
    @Timed
    public Rule presentRandomRule() {
        return rulesRepository.random().orElse(new Rule());
    }

}
