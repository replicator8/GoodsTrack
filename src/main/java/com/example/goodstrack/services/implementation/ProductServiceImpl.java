package com.example.goodstrack.services.implementation;

import com.example.goodstrack.repositories.implementation.ProductRepositoryDaoImpl;
import com.example.goodstrack.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositoryDaoImpl productRepository;

    private final ModelMapper modelMapper = new ModelMapper();


}
