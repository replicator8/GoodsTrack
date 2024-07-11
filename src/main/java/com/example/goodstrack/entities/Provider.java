package com.example.goodstrack.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "provider")
public class Provider {
    private Long id;
    private List<Product> products;
    private List<Store> stores;

    public Provider() {}

    public Provider(List<Product> products, Long id, List<Store> stores) {
        this.products = products;
        this.id = id;
        this.stores = stores;
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

    @OneToMany
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @OneToMany
    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
