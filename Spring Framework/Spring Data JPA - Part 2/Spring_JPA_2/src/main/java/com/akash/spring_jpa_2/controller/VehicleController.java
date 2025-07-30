package com.akash.spring_jpa_2.controller;

import com.akash.spring_jpa_2.model.Bike;
import com.akash.spring_jpa_2.model.Car;
import com.akash.spring_jpa_2.model.Vehicle;
import com.akash.spring_jpa_2.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/car")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(vehicleService.saveCar(car));
    }

    @GetMapping("/car")
    public List<Car> getCars() {
        return vehicleService.getAllCars();
    }

    @PostMapping("/bike")
    public ResponseEntity<Bike> addBike(@RequestBody Bike bike) {
        return ResponseEntity.ok(vehicleService.saveBike(bike));
    }

    @GetMapping("/bike")
    public List<Bike> getBikes() {
        return vehicleService.getAllBikes();
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

}
