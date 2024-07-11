package com.example.goodstrack.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "provider")
public class Provider extends BaseEntity {
    private List<Product> products;
    private List<Store> stores;

    protected Provider() {}

    public Provider(List<Product> products, List<Store> stores) {
        this.products = products;
        this.stores = stores;
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
