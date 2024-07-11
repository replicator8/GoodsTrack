package com.example.goodstrack.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "supply")
public class Supply extends BaseEntity {
    private Provider provider;
    private Store store;
    private List<Product> products;
    private Date dateSupply;

    protected Supply() {}

    public Supply(Provider provider, Store store, Date dateSupply) {
        this.provider = provider;
        this.store = store;
        this.dateSupply = dateSupply;
    }

    @OneToMany
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getDateSupply() {
        return dateSupply;
    }

    public void setDateSupply(Date dateSupply) {
        this.dateSupply = dateSupply;
    }

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store getStore() {
        return store;
    }

    private void setStore(Store store) {
        this.store = store;
    }
}
