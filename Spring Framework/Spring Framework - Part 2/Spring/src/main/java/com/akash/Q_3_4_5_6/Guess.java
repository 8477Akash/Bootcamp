package com.akash.Q_3_4_5_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//Q3 -> using component and autowired


@Component
public class Guess {

    private Computer computer;


    public Guess(){
        System.out.println("Guess Constructor");
    }

    //Q6 -> constructor injection
    @Autowired
    public Guess(Computer computer) {
        this.computer = computer;
        System.out.println("Guess Constructor");
    }


    public void setComputer(Computer computer) {
        this.computer=computer;
        System.out.println("setComputer");
    }

    public void guessRunner() {
        computer.compile();
    }
}
