import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class BaseConfiguration extends Configuration {

    @NotNull
    private final int defaultSize;

    @JsonCreator
    public BaseConfiguration(@JsonProperty("defaultSize") final int defaultSize) {
        this.defaultSize = defaultSize;
    }

    public int getDefaultSize() {
        return defaultSize;
    }

}
