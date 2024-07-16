package com.example.goodstrack.domain;

import com.example.goodstrack.domain.enums.ProductStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    private String name;
    private Double price;
    private LocalDate expirationDate;
    private ProductStatus status;

    protected Product() {}

    public Product(String name, Double price, ProductStatus status, LocalDate expirationDate) {
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
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Column(name = "status", nullable = false, length = 65)
    @Enumerated(EnumType.STRING)
    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}
