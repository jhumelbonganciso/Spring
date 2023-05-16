package org.spring.main;

import org.spring.beans.Vehicle;
import org.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("Vehicle name from non-spring is " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh = context.getBean(Vehicle.class);

        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        var str = context.getBean(String.class);

        System.out.println("String value from config file is " + str);

        var num = context.getBean(Integer.class);
        System.out.println("Number from project config is " + num);
    }
}
