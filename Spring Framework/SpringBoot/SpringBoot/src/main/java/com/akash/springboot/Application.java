package com.akash.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Q2 ->
 * **/
//public class Application implements CommandLineRunner {
//
//    @Value("${app.name}")
//    private String appName;
//
//    @Value("${app.version}")
//    private String appVersion;
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("App Name : " + appName);
//        System.out.println("App Version : " + appVersion);
//    }
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//}
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Hello World");
    }
}


