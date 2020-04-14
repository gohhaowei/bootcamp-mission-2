package com.btkbootcamp.mission2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor

public class Car {

    private UUID id;
    private String brand;
    private String model;
    private String year;

    public Car (String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.id = UUID.randomUUID();

    }
}
