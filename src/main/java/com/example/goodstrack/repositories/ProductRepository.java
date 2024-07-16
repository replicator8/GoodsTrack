package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ProductRepository {
    Optional<Product> findById(int id);
    Set<Product> findAllByName(String name);
    Product save(Product product);
    Boolean checkExpirationDate(int id);
    void setDiscountInPercentages(int id, Double discount);
    String getStatusById(int id);
}
