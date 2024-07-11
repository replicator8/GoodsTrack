package com.example.goodstrack.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    private Long id;
    private String name;
    private Double price;
    private Date expiration_date;
    private String status;

    protected Product() {}

    public Product(String status, Date expiration_date, String name, Double price) {
        this.status = status;
        this.expiration_date = expiration_date;
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

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
