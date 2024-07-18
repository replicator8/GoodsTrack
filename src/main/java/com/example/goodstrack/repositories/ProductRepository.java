package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface ProductRepository {
    Set<Product> findAllByName(String name);
    Boolean checkAndDisposeGoods(Set<Product> products);
    void setDiscountInPercentages(int id, Double discount);
    String getStatusById(int id);
    Set<Product> findAllById();
    Boolean addProduct(Product product);
    Boolean checkExpiration(Set<ProductDto> productsDto);
}
