package org.spring.throughAutoWiringOnClassFields.bean;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Vehicle name is " + name;
    }
}
