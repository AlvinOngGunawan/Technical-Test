package com.example.technicaltest.entity;

import jakarta.persistence.*;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long carId;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "brand_id")
    private Long brandId;

    // Constructors, getters, and setters

    public Car() {
    }

    public Car(String carName, Long brandID) {
        this.carName = carName;
        this.brandId = brandID;
    }

    // Getter and setter methods

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
