package com.example.goodstrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name = "supplier")
public class Supplier extends BaseEntity {
    private Set<Product> products;
    private Set<Store> stores;
    private Set<Supply> supplies;

    protected Supplier() {}

    public Supplier(Set<Product> products, Set<Store> stores) {
        this.products = products;
        this.stores = stores;
    }

    @ElementCollection
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @ElementCollection
    public Set<Store> getStores() {
        return stores;
    }

    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }

    @OneToMany(mappedBy = "supplier")
    public Set<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(Set<Supply> supplies) {
        this.supplies = supplies;
    }
}
