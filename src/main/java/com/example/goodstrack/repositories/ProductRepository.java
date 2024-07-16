package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long id);
    List<Product> findAllByName(String name);
    Product save(Product product);
    Boolean checkExpirationDate(Long id);
    void setDiscountInPercentages(Long id, Double discount);
    String getStatusById(Long id);
}
