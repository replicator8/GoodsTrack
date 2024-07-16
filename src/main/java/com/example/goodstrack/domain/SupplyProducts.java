package com.example.goodstrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "supply_products")
public class SupplyProducts extends BaseEntity {
    private Supply supply;
    private Product product;

    protected SupplyProducts() {}

    public SupplyProducts(Supply supply, Product product) {
        this.supply = supply;
        this.product = product;
    }

    @ManyToOne
    @JoinColumn(name = "supply_id")
    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
