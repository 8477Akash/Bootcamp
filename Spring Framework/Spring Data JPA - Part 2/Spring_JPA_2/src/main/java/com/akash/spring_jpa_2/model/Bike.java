package com.akash.spring_jpa_2.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("Bike")
public class Bike extends Vehicle {
    private boolean hasCarrier;

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
