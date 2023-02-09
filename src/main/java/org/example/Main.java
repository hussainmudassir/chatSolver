package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.example.repositories.JsonFileRulesRepository;
import org.example.resources.RulesResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main extends Application<AppConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

//        System.out.println("Hello world!");
        new Main().run(args);

    }

    @Override
    public void initialize(final Bootstrap<AppConfiguration> bootstrap) {
//        bootstrap.addBundle(
//                GuiceB
//        );
    }

    @Override
    public void run(AppConfiguration configuration, final Environment environment) throws Exception {
        LOGGER.info("Starting application with name: {}", configuration.getAppName());

        final JsonFileRulesRepository rulesRepository = new JsonFileRulesRepository();
        final RulesResource rulesResource = new RulesResource(rulesRepository);

        environment.jersey().register(rulesResource);

    }
}