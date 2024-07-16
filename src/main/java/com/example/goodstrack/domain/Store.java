package com.example.goodstrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name = "store")
@Embeddable
public class Store extends BaseEntity {
    private String name;
    private String address;
    private Set<Supply> supplies;

    protected Store() {}

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
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

    @OneToMany(mappedBy = "store")
    public Set<Supply> getSupplies() {
        return supplies;
    }
    public void setSupplies(Set<Supply> supplies) {
        this.supplies = supplies;
    }
}
