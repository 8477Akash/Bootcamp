package com.akash.spring_jpa_2.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("Car")
public class Car extends Vehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
