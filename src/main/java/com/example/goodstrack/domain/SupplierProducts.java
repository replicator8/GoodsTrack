package com.example.goodstrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier_products")
public class SupplierProducts extends BaseEntity {
    private Supplier supplier;
    private Product product;

    protected SupplierProducts() {}

    public SupplierProducts(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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
