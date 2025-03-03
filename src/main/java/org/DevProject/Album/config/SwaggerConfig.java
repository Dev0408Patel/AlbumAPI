package org.DevProject.Album.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Dev Project Album", version = "Verions 1.0", contact = @Contact(name = "Dev B Patel", email = "dev0408patel@gmail.com", url = "https://DevPortfolio.com"), license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"), termsOfService = "", description = "Spring Boot RestFul API for Album made by Dev Patel"))
public class SwaggerConfig {
}
