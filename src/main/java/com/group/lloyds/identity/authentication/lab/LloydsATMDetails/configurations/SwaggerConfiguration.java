package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    public static final Contact SUPPORTED_CONTACTS = new Contact("Shruthi Chandekar","",
            "shruthirc3@mail.com");

    @Bean
    public Docket newApi(){
        Set produce= new HashSet<>(Arrays.asList("application/json","application/vnd.spring-boot.actuator.v2+json","application/vnd.spring-boot.actuator.v3+json"));
        Set consume= new HashSet<>(Arrays.asList("application/json"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .produces(produce)
                .consumes(consume);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("ATM Details Service")
                .description("ATM Details ServiceWith Swagger Documentation")
                .contact(SUPPORTED_CONTACTS)
                .license("ATM Details Service Licence Version 1.0")
                .version("3.0")
                .build();
    }
}
