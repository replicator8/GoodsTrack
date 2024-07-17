package com.example.goodstrack.services;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.AddProductsDto;
import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.dtos.StoreDto;

import java.util.Set;

public interface StoreService {
    public Boolean disposeGoods(Set<ProductDto> products);
    public Set<Product> getAllProducts();
    public Boolean addProducts(AddProductsDto addProductsDto);
}
