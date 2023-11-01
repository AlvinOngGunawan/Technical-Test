package com.example.technicaltest.controller;

import com.example.technicaltest.entity.Car;
import com.example.technicaltest.repository.CarServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/car")
@RestController
public class Controller {

    @Resource
    CarServiceImpl carServiceImpl;
//    @GetMapping
//    public List<Car> findCarEndpoint() {
//        return carServiceImpl.findAll();
//    }

    @GetMapping()
    public List<Car> findCarByBrandNameEndpoint(@RequestParam(value = "brand", required = false, defaultValue = "") String brandName) {
        return carServiceImpl.findCarByBrandName(brandName);
    }
}
