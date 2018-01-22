package linkrest.demo.api;

import com.nhl.link.rest.DataResponse;
import com.nhl.link.rest.LinkRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
public class ScheduleApi {

    @Context
    Configuration configuration;

    @GET
    public DataResponse<Game> get(@Context UriInfo uriInfo) {
        return LinkRest.select(Game.class, configuration)
                .uri(uriInfo)
                .get();
    }
}
