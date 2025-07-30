package com.akash.spring_jpa_2.model;

import jakarta.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="vehicle_type", discriminatorType = DiscriminatorType.STRING)
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int Tyres;
    private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTyres() {
        return Tyres;
    }

    public void setTyres(int tyres) {
        Tyres = tyres;
    }
}
