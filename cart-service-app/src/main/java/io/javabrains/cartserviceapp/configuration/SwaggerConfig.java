package io.javabrains.cartserviceapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(getInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("io.javabrains.cartserviceapp.controller"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }
    private ApiInfo getInfo() {
        return new ApiInfo("Cart Service", "Product in the cart", "1.0", "Terms of Service",
                new Contact("Suruchi Sinha", "http://localhost:8761","shopatyourease9@gmail.com"),
                "License of APIs", "API License URL", Collections.emptyList());
    }
}