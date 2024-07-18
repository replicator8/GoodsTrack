package com.example.goodstrack.controllers;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.AddProductsDto;
import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.dtos.ProductNameDto;
import com.example.goodstrack.services.implementation.ProductServiceImpl;
import com.example.goodstrack.services.implementation.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

@RestController
public class StoreController {

    @Autowired
    private StoreServiceImpl storeService;

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping("/store/checkExpireAndDisposeGoods")
    public Boolean checkAndDisposeGoods(@RequestBody Set<ProductDto> products) {
        return productService.checkAndDisposeGoods(products);
    }

    @GetMapping("/store/products")
    public Set<Product> getAllProducts() {
        return storeService.getAllProducts();
    }

    @PostMapping("/store/checkExpirationAndSendToShelves")
    public Boolean sendGoodsToShelves(@RequestBody AddProductsDto addProductsDto) {
        if (!productService.checkAndDisposeGoods(addProductsDto.getProducts())) {
            return storeService.addProducts(addProductsDto);
        } else {
            return false;
        }
    }

    @PostMapping("/store/inventoryOfGoods")
    public Long inventoryOfGoods(@RequestBody ProductNameDto productNameDto) {
        return productService.inventory(productNameDto);
    }

}
