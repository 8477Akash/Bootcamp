package com.akash.Q2;

public class LooseCoupling {

    private final Vehicle vehicle;


    LooseCoupling(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void display(){
        vehicle.show();
    }
}
