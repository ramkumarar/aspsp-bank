package com.rbsg.ob.aspspbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Payment Initiation API Specification")
                .description("Swagger for Payment Initiation API Specification")
                .license("open-licence")
                .licenseUrl("https://www.openbanking.org.uk/open-licence")
                .termsOfServiceUrl("")
                .version("v1.1.1")
                .contact(new Contact("","", "ServiceDesk@openbanking.org.uk"))
                .build();
    }

    @Bean
    public Docket pispApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rbsg.ob.aspspbank.controller"))
                .build();

    }
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}

