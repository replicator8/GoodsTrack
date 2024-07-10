package com.example.goodstrack.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "supply")
public class Supply {
    private Long id;
    private Long provider_id;
    private Long store_id;
    private Date date_supply;

    public Supply() {}

    public Supply(Long id, Long provider_id, Long store_id, Date date_supply) {
        this.id = id;
        this.provider_id = provider_id;
        this.store_id = store_id;
        this.date_supply = date_supply;
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

    public Date getDate_supply() {
        return date_supply;
    }

    public void setDate_supply(Date date_supply) {
        this.date_supply = date_supply;
    }

    public Long getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Long provider_id) {
        this.provider_id = provider_id;
    }

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }
}
