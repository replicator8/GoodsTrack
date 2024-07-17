package com.example.goodstrack.controllers;

import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.services.implementation.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

@RestController
public class StoreController {

    @Autowired
    private StoreServiceImpl storeService;

    @PostMapping("/store/disposeGoods")
    public Boolean disposeGoods(@RequestBody Set<ProductDto> products) {
        return storeService.disposeGoods(products);
    }
}
