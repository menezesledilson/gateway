package br.com.ebac.ebacgatewayapi.roteamento;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
@Configuration
class ConfiguradorRotas {
    @Bean
    public RouteLocator minhasRotas(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/oi-ebac")
                        .filters(f -> f.addRequestHeader("oi", "Mundo"))
                        .uri("http://httpbin.org")
                )
                .build();
    }
}
