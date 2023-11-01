package com.example.technicaltest.dao;

import com.example.technicaltest.entity.Car;
import com.example.technicaltest.mapper.CarRowMapper;
import com.example.technicaltest.repository.CarServiceImpl;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CarServiceImplImpl implements CarServiceImpl {
    public CarServiceImplImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;
    @Override
    public List<Car> findAll() {
        return template.query("select car_id, car_name, brand_id from technicaltest.car", new CarRowMapper());
    }

    @Override
    public List<Car> findCarByBrandName(String brandName) {
        Map<String,Object> map=new HashMap<String,Object>();
        String query = "select c.car_id, c.car_name, c.brand_id from technicaltest.car c JOIN technicaltest.brand b ON c.brand_id = b.brand_id ";
        if (!brandName.equals("")) {
            map.put("brand_name", brandName);
            query += "WHERE b.brand_name = :brand_name ";
        }
        return template.query(query, map, new CarRowMapper());
    }
}
