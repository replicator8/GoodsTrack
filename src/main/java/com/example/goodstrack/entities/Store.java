package com.example.goodstrack.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "store")
public class Store {
    private Long id;
    private String name;
    private String address;
    private List<Product> products;

    public Store() {}

    public Store(Long id, String name, String address, List<Product> products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.products = products;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
