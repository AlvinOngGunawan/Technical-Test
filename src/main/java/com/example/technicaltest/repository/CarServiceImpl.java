package com.example.technicaltest.repository;

import com.example.technicaltest.entity.Car;

import java.util.List;

public interface CarServiceImpl {
    List<Car> findAll();
    List<Car> findCarByBrandName(String brandName);
}
