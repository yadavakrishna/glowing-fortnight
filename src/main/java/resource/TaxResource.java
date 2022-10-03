package resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tax")
@Produces(MediaType.APPLICATION_JSON)
public class TaxResource {

    //TODO: 1st Input Tax Slab, 2nd total - JSON containing all tax information
    public void calculateTax(String taxSlab) {

    }
}
