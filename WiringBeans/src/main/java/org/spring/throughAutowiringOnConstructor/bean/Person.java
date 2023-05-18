package org.spring.throughAutowiringOnConstructor.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {



    private String name = "Jhumel";

    private final Vehicle vehicle;

    /*By autowiring through constructor, you can make the instance final inside a class*/

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


}
