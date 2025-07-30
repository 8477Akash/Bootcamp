package com.akash.spring_jpa_2.repository;

import com.akash.spring_jpa_2.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Long> {
}
