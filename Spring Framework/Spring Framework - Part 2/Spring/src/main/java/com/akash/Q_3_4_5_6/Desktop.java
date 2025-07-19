package com.akash.Q_3_4_5_6;

import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Desktop Compile");
    }
}
