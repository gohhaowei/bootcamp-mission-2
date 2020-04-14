package com.btkbootcamp.mission2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional.*;

@RestController
@RequestMapping("/api/cars")

public class CarController {



    ArrayList<Car> listOfCars = new ArrayList<Car>();

    @GetMapping
    public Iterable findAll(){
        return listOfCars;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car create(@RequestBody Car car){
        listOfCars.add(car);
        return car;
    }


}
