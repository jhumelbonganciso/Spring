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

        var veh = context.getBean("vehicle1", Vehicle.class);

        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

    }
}
