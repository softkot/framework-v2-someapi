package org.somecompany.api.guice;

import com.google.api.server.spi.guice.EndpointsModule;
import org.somecompany.api.DemoEndpoint;

import java.util.Collections;

public class ApiModule extends EndpointsModule {
    @Override
    protected void configureServlets() {
        bind(DemoEndpoint.class).toInstance(new DemoEndpoint());
        configureEndpoints("/_ah/api/*", Collections.singletonList(DemoEndpoint.class));
    }
}
