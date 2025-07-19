package com.akash.Q_3_4_5_6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Q_3_4_5_6 {

    public static void main(String[] args) {
        /**
         * Q3 -> WE are using @Component  to create components and give control of bean creation entirely to the spring
         *       AppConfig.java is the Config Class with @ComponentScan to make @Component
         *       @AutoWired basicallly injects the dependency as the context is created
         * **/

        /**
         * Q4 -> Since we are not using xml based configuration
         *       So we are using AnnotationConfigApplicationContext() to get the context first
         *       then using this context to get the  bean and then calling relevant methods
         * **/


        /**
          * Q5 ->
          *  Ambiguity occurs when we have 2 beans of the same class
          *  to resolve this we have use @Primary or @Qualifier
          * **/


        /**
         * Q6 ->
         * In spring if we have multiple constructors then we have to use @AutoWired on a constructor
         * we want to use to inject the dependency
         * if we have only one constructor and autowired is not used java itself picks that contructor
         * for dependency injecion
         * **/


        //creating context (Q4)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Guess guess = applicationContext.getBean(Guess.class);

        guess.guessRunner();

    }
}
