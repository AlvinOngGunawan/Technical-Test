package com.example.technicaltest.mapper;

import com.example.technicaltest.entity.Brand;
import com.example.technicaltest.entity.Car;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarRowMapper implements RowMapper<Car> {

    public Car mapRow(ResultSet rs, int args1) throws SQLException {
        Car car = new Car();
        car.setCarId(rs.getLong("car_id"));
        car.setCarName(rs.getString("car_name"));
        car.setBrandId(rs.getLong("brand_id"));
        return car;
    }
}
