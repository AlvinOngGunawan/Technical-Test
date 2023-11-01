package com.example.technicaltest.entity;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "Brand")
public class Brand {

    @Id
    @Column(name = "brand_id")
    private String brandId;

    @Column(name = "brand_name")
    private String brandName;

    // Constructors, getters, and setters

    public Brand() {
    }

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    // Getter and setter methods

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
