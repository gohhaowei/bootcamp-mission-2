package com.btkbootcamp.mission2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/cars")

public class CarController {

    int id = 1; // Sets the initial id number (running number)
    ArrayList<Car> listOfCars = new ArrayList<Car>(); // This will store the list of cars created

    // Return all cars created
    @GetMapping
    public Iterable getAllCars(){
        return listOfCars;
    }

    // Return only the car with the matching id
    @GetMapping ("/{id}")
    public Car getOneCar(@PathVariable int id){
        for (Car car : listOfCars){
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }

    // Create a new car
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car create(@RequestBody Car car){
        car.setId(id++); // This is where id is incremented for every new car created
        listOfCars.add(car);
        return car;
    }

    // Delete the car with the matching id
    @DeleteMapping ("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        // Search through the ArrayList of cars. If the current car has
        // matching id, then this car is removed.
        for (Car car : listOfCars) {
            if (car.getId() == id) {
                listOfCars.remove(car);
                return;
            }
        }
    }

    // Update the car with the matching id
    @PutMapping ("/{id}")
    public Car update(@PathVariable int id, @RequestBody Car newCar) {
        // Search through the ArrayList of cars. If the current car has
        // matching id, then fetch the index of the car that was found.
        // Then, replace it with the new car object from the Request Body.
        for (Car car : listOfCars) {
            if (car.getId() == id){
                newCar.setId(id);
                listOfCars.set(listOfCars.indexOf(car), newCar);
                return newCar;
            }
        }
        return null;
    }
}
