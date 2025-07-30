package com.akash.spring_jpa_2.service;

import com.akash.spring_jpa_2.model.Bike;
import com.akash.spring_jpa_2.model.Car;
import com.akash.spring_jpa_2.model.Vehicle;
import com.akash.spring_jpa_2.repository.BikeRepo;
import com.akash.spring_jpa_2.repository.CarRepo;
import com.akash.spring_jpa_2.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private BikeRepo bikeRepo;

    // Vehicle
    public List<Vehicle> getAllVehicles() {
        return vehicleRepo.findAll();
    }

    // Car
    public Car saveCar(Car car) {
        return carRepo.save(car);
    }

    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    // Bike
    public Bike saveBike(Bike bike) {
        return bikeRepo.save(bike);
    }

    public List<Bike> getAllBikes() {
        return bikeRepo.findAll();
    }
}
