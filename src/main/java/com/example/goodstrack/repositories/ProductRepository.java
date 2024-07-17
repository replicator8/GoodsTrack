package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import java.util.Set;

public interface ProductRepository {
    Set<Product> findAllByName(String name);
    Boolean checkExpirationDate(int id);
    void setDiscountInPercentages(int id, Double discount);
    String getStatusById(int id);
}
