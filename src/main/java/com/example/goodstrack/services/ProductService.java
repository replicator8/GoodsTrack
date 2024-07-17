package com.example.goodstrack.services;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;

import java.util.Set;

public interface ProductService {
    public Boolean checkExpirationDate(int id);
    public Product getProduct(int id);
    public Set<Product> getProducts(Integer id);
    Boolean addProduct(ProductDto product);
}
