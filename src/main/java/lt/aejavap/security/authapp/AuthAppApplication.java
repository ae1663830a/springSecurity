package lt.aejavap.security.authapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Pageable;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AuthAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthAppApplication.class, args);
    }

    @Bean
    public Docket swaggerDocket() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("lt.aejavap.security.authapp")).build();
        docket.ignoredParameterTypes(Pageable.class);
        return docket;
    }

    /**
     * Swagger builder.
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring security basic example")
                .version("0.1-SNAPSHOT").build();
    }
}
