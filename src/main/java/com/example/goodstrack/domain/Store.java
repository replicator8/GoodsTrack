package com.example.goodstrack.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "store")
@Embeddable
public class Store extends BaseEntity {
    private String name;
    private String address;
    private Set<Product> products;
    private Set<Supply> supplies;

    protected Store() {}

    public Store(String name, String address, Set<Product> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    @Column(name = "address", nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(targetEntity=Product.class )
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @OneToMany(mappedBy = "store")
    public Set<Supply> getSupplies() {
        return supplies;
    }
    public void setSupplies(Set<Supply> supplies) {
        this.supplies = supplies;
    }
}
