package com.btkbootcamp.mission2;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @Data

public class Car {

    int id; // Stores the id number of each Car (this will be a running number)
    private String brand; // Brand of the car (e.g. Toyota)
    private String model; // Model of the car (e.g. Camry)
    private String year; // Year of the car (e.g. 2020)

    public Car (String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

}
