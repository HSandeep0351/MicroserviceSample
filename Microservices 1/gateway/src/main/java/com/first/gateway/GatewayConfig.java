package com.first.gateway;

import org.springframework.cloud.gateway.route.RouteLocator; 
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service1", r -> r
                        .path("/customer/**")
                        .uri("lb://customer-service"))
                .route("service2",r -> r
                		.path("/team/**")
                		.uri("lb://two-service"))
                .build();
    }
}