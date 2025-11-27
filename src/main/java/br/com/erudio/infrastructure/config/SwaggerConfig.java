package br.com.erudio.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    protected OpenAPI swagger() {
        String serverUrl = "";

        return new OpenAPI()
                .info(info())
                .servers(List.of(new Server().url(serverUrl)));
    }

    private Info info() {
        return new Info()
                .title("REST API from my Barber Shop")
                .version("v1")
                .description("Spring Boot 2025 REST API's do 0 à AWS e GCP c Java e Docker")
                .license(license());
    }

    private License license() {
        return new License()
                .name("N/A")
                .url("");
    }
}
