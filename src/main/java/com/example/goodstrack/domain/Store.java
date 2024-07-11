package com.example.goodstrack.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "store")
public class Store extends BaseEntity {
    private String name;
    private String address;
    private List<Product> products;

    protected Store() {}

    public Store(String name, String address, List<Product> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
