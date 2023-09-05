package med.voll.api.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;


@Configuration
public class SpringDocConfigurations {
    @Configuration
    public class SpingDocConfigurations {

        @Bean
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .components(new Components()
                            .addSecuritySchemes("bearer-key",
                                    new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
        }
    }
}
