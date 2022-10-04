package resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tax")
@Produces(MediaType.APPLICATION_JSON)
public class TaxResource {

    public double calculateTax(double income) {
        double ans = 0;

        if (income < 250000) {
            ans += 0;
        } else if (income < 500000) {
            ans += 0.05 * (income - 250000);
        } else if (income < 750000) {
            ans += (0.05 * 250000) + (0.10 * (income - 500000));
        } else if (income < 1000000) {
            ans += (0.05 * 250000) + (0.10 * 250000) + (0.15 * (income - 750000));
        } else if (income < 1250000) {
            ans += (0.05 * 250000) + (0.10 * 250000) + (0.15 * 250000) + (0.20 * (income - 1000000));
        } else if (income < 1500000) {
            ans += (0.05 * 250000) + (0.10 * 250000) + (0.15 * 250000) + (0.20 * 250000) + (0.25 * (income - 1250000));
        } else if (income >= 1500000) {
            ans += (0.05 * 250000) + (0.10 * 250000) + (0.15 * 250000) + (0.20 * 250000) + (0.25 * 250000) + (0.30 * (income - 1500000));
        }

        return ans;
    }
}
