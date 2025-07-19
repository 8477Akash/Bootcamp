package com.akash.Q2;


public class Q2 {
    public static void main( String[] args )
    {

        // Loose Coupling
        Vehicle vehicle = new Car();
        LooseCoupling l = new LooseCoupling(vehicle);

        l.display();


    }
}
