package com.staz.CamelJaegerSB;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.Configurer;
import org.springframework.context.annotation.Configuration;

@Configuration
@Configurer
public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() {
        // you can configure the route rule with Java DSL here
        from("timer:trigger?exchangePattern=InOut&period=1000").streamCaching().log("***Start**")
                .bean("counterBean")
                .log(" Client request: ${body}")
                .bean("outBean", "accept")
                .log("Client response: ${body}")
                .log("***end");
    }
}
