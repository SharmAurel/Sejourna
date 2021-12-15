package com.example.sejournaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SejournaApiApplication {

    public static void main(String[] args) {
    Data_input x=new Data_input(null);
    Creation_planning y=new Creation_planning(x);
    y.sort_array();
    y.creation();
    }

}
