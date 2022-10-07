<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
=======

package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
>>>>>>> c9c1eb98602320ad8a733789eab6b055e21fc822
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
<<<<<<< HEAD

public class SwaggerConfiguracao {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }

    private ApiInfo apiInfo() {
=======
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguracao {
    
    @Bean
    public Docket docket(){
      return new Docket(DocumentationType.SWAGGER_2)
              .useDefaultResponseMessages(false)
              .select()
              .apis(RequestHandlerSelectors
                    .basePackage("com.example.demo.controller"))
              .paths(PathSelectors.any())
              .build()
              .apiInfo(apiInfo());
    
    }
    private ApiInfo apiInfo(){
>>>>>>> c9c1eb98602320ad8a733789eab6b055e21fc822
        return new ApiInfoBuilder()
                .title("API RESERVA DE MESA")
                .description("Api para reservar mesa")
                .version("1.0")
                .termsOfServiceUrl("https://github.com/brunomecca123")
                .license("Bruno Mecca")
                .build();
    }
<<<<<<< HEAD

=======
    
>>>>>>> c9c1eb98602320ad8a733789eab6b055e21fc822
}
