package com.example.goodstrack.services.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.repositories.implementation.ProductRepositoryDaoImpl;
import com.example.goodstrack.services.ProductService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositoryDaoImpl productRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    @Transactional
    public Boolean checkAndDisposeGoods(Set<ProductDto> productsDto) {
        Set<Product> pr = productsDto.stream()
                .map(dto -> modelMapper.map(dto, Product.class))
                .collect(Collectors.toSet());
        return productRepository.checkAndDisposeGoods(pr);
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
