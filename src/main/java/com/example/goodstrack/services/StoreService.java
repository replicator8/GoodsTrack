package com.example.goodstrack.services;

import com.example.goodstrack.domain.Product;

import java.util.Set;

public interface StoreService {
    public Boolean refundToSupplier(Set<Product> products);

}
