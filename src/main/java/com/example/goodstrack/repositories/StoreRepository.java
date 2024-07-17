package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.Supplier;
import java.util.Set;

public interface StoreRepository {
    Set<Store> findAllByName(String name);
    Set<Product> getAllProducts();
    Set<Supplier> getAllSuppliers(int id);
    Boolean goodsDisposal(Set<Product> products);
}
