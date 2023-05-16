package org.spring.main;

import org.spring.beans.Vehicle;
import org.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {

        /*
        * Without specifying the correct bean, if you have a bean with same data type
        * it will throw NoUniqueBeanDefinitionException.
        * So you need to throw what bean are you pertaining to.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh = context.getBean("audiVehicle", Vehicle.class);
        var veh2 = context.getBean("hondaVehicle", Vehicle.class);
        var veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        var veh4 = context.getBean(Vehicle.class);

        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
        System.out.println("Vehicle name from Spring Context is: " + veh4.getName());

    }
}
