package com.example.goodstrack.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "supply")
public class Supply {
    private Long id;
    private Provider provider;
    private Store store;
    private List<Product> products;
    private Date date_supply;

    public Supply() {}

    public Supply(Long id, Provider provider, Store store, Date date_supply) {
        this.id = id;
        this.provider = provider;
        this.store = store;
        this.date_supply = date_supply;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @OneToMany
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_supply() {
        return date_supply;
    }

    public void setDate_supply(Date date_supply) {
        this.date_supply = date_supply;
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
