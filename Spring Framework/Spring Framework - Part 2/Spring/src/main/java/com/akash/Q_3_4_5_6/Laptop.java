package com.akash.Q_3_4_5_6;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Q5) -> resolving ambiguity
@Component
@Primary
public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("Laptop compiled");
    }
}
