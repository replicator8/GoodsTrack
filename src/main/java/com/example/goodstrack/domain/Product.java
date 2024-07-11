package com.example.goodstrack.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    private Long id;
    private String name;
    private Double price;
    private Date expirationDate;
    private String status;

    protected Product() {}

    public Product(String status, Date expirationDate, String name, Double price) {
        this.status = status;
        this.expirationDate = expirationDate;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
