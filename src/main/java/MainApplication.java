import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<BaseConfiguration> {

    public static void main(String[] args) throws Exception {
        new MainApplication().run("server", "config.yml");
    }

    @Override
    public void run(BaseConfiguration baseConfiguration, Environment e) throws Exception {
        final int defaultSize = baseConfiguration.getDefaultSize();
        e.jersey().register(new HealthCheckController(e.healthChecks()));

    }

    @Override
    public void initialize(Bootstrap<BaseConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
        super.initialize(bootstrap);
    }
}
