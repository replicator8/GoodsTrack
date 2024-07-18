package com.example.goodstrack.services;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;
import java.util.Set;

public interface ProductService {
    public Boolean checkAndDisposeGoods(Set<ProductDto> products);
    public Product getProduct(int id);
    public Set<Product> getProducts();
    public Boolean addProduct(ProductDto product);
    public void setDiscountInPercentages(Integer id, Double discount);
}
