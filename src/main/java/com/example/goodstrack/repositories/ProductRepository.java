package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface ProductRepository {
    Set<Product> findAllByName(String name);
    Boolean checkExpirationDate(int id);
    void setDiscountInPercentages(int id, Double discount);
    String getStatusById(int id);
    Set<Product> findAllById();
    Boolean addProduct(Product product);
}
