package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication//this icludes @Configuration
public class MeTicketingProjectDataApplication {

    public static void main(String[] args) {

        SpringApplication.run(MeTicketingProjectDataApplication.class, args);
    }

    //  am traying to add nan in the container thru @Bean annatation
    //Create  a class annotation with @Configuration
    //Write a method which returm the object that you trying to add in the container



    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
    //Annatation this mothod whit @Bean


}
