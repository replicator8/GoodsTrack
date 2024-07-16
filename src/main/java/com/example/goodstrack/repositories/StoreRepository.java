package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.Supplier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface StoreRepository {
    Store findById(int id);

    Store findAllByName(String name);

    @Query(value = "select p.product from StoreProducts p join Store s where p.store.id = :id")
    Set<Product> getAllProducts(@Param(value = "id") int id);

    @Query(value = "select p.supplier from SupplierStores p join Store s where p.store.id = :id")
    Set<Supplier> getAllSuppliers(@Param(value = "id") int id);
}
