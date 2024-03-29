package com.pms.schedule.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        Contact peterJohnsons = new Contact("Peter Johnsons", "http://www.mattjohnson.com", "matt.johnson@swagger.com");
        return new ApiInfoBuilder()
                .title("Title: Product Resource API enpoints")
                .version("v1.5")
                .description("Desc: API for managing product")
                .contact(peterJohnsons)
                .license("Training Licence Version 1.5")
                .build();
    }
}
