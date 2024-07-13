package com.example.goodstrack.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Embeddable;
import java.util.Date;

@Entity
@Table(name = "product")
@Embeddable
public class Product extends BaseEntity {
    private String name;
    private Double price;
    private Date expirationDate;
    private String status;

    protected Product() {}

    public Product(String status, Date expirationDate, String name, Double price) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.status = status;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price", nullable = false)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "expiration_date", nullable = false, length = 127)
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Column(name = "status", nullable = false, length = 65)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
