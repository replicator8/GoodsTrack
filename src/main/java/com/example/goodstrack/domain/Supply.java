package com.example.goodstrack.domain;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "supply")
public class Supply extends BaseEntity {
    private Supplier supplier;
    private Store store;
    private Set<Product> products;
    private Date dateSupply;

    protected Supply() {}

    public Supply(Supplier supplier, Store store, Date dateSupply, Set<Product> products) {
        this.supplier = supplier;
        this.store = store;
        this.dateSupply = dateSupply;
        this.products = products;
    }

    @OneToMany
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Column(name = "date_supply", nullable = false, length = 127)
    public Date getDateSupply() {
        return dateSupply;
    }

    public void setDateSupply(Date dateSupply) {
        this.dateSupply = dateSupply;
    }

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier getProvider() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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
