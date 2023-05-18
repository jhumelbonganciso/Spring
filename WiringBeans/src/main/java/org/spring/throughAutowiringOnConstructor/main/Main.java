package org.spring.throughAutowiringOnConstructor.main;

import org.spring.throughMethodCall.bean.Person;
import org.spring.throughMethodCall.bean.Vehicle;
import org.spring.throughMethodCall.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
        * Without specifying the correct bean, if you have a bean with same data type
        * it will throw NoUniqueBeanDefinitionException.
        * So you need to throw what bean are you pertaining to.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        var veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        System.out.println("Person from bean " + person.getName());
        System.out.println("Vehicle that person own is: " + person.getVehicle());


    }
}
