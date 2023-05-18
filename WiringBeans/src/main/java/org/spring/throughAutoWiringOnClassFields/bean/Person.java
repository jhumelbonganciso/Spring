package org.spring.throughAutoWiringOnClassFields.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    public Person() {

    }

    private String name = "Jhumel";

    @Autowired
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
