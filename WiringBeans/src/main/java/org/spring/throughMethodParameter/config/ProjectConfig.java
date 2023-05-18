package org.spring.throughMethodParameter.config;

import org.spring.throughMethodCall.bean.Person;
import org.spring.throughMethodCall.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Spring @configuration annotation is aprt of the spring core framework.
* Spring configuration annotation indicates that the class has @Bean definition
* methods. So Spring container can process the class and generate Spring Beans to
* be used in the application
*/

@Configuration
public class ProjectConfig {

    /*
    * @Bean annotation, which lets Spring know that it needs to call this method when it initializes
    * its context and adds the returned value to the context*/
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }


    @Bean
    Person person(Vehicle vehicle) {
        var person = new Person();
        person.setName("Jhumel");
        person.setVehicle(vehicle);
        return person;
    }


}
