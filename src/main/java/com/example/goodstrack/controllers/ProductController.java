package com.example.goodstrack.controllers;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.DiscountDto;
import com.example.goodstrack.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/all")
    public Set<Product> getAllProducts() {
        return productService.getProducts();
    }

    @PostMapping("/products/makeDiscount")
    public void setDiscountInPercentages(@RequestBody DiscountDto discount) {
        productService.setDiscountInPercentages(discount.getId(), discount.getDiscount());
    }
}
