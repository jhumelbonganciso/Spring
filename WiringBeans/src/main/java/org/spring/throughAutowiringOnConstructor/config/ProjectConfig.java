package org.spring.throughAutowiringOnConstructor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
* Spring @configuration annotation is aprt of the spring core framework.
* Spring configuration annotation indicates that the class has @Bean definition
* methods. So Spring container can process the class and generate Spring Beans to
* be used in the application
*/

@Configuration
@ComponentScan(basePackages = "org.spring.throughAutoWiringOnClassFields.bean")
public class ProjectConfig {

    /*
    * @Bean annotation, which lets Spring know that it needs to call this method when it initializes
    * its context and adds the returned value to the context*/



}
