package com.example.goodstrack.services.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.repositories.implementation.ProductRepositoryDaoImpl;
import com.example.goodstrack.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositoryDaoImpl productRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Boolean checkExpirationDate(int id) {
        return productRepository.checkExpirationDate(id);
    }

    @Override
    public Product getProduct(int id) {
        return productRepository.findById(Product.class, id);
    }

    @Override
    public Set<Product> getProducts() {
        return productRepository.findAllById();
    }

    @Override
    public Boolean addProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return productRepository.addProduct(product);
    }

    @Override
    public void setDiscountInPercentages(Integer id, Double discount) {
        productRepository.setDiscountInPercentages(id, discount);
    }
}
