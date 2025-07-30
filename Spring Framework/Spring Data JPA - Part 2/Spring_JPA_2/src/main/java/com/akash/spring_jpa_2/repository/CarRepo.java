package com.akash.spring_jpa_2.repository;

import com.akash.spring_jpa_2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car  , Long> {
}
