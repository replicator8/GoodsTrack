package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface ProductRepository {
    Set<Product> findAllByName(String name);
    Boolean checkExpirationDate(int id);
    void setDiscountInPercentages(int id, Double discount);
    String getStatusById(int id);
    Set<Product> findAllById(int id);
    Boolean addProduct(Product product);
}
