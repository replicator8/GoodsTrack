package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.ProductRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryDaoImpl implements ProductRepository {

    GenericRepository<Product, Long> genericRepository;

    public ProductRepositoryDaoImpl(GenericRepository<Product, Long> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return genericRepository.findById(id);
    }

    @Override
    public List<Product> findAllByName(String name) {
        return genericRepository.findAllByName(name);
    }

    @Override
    public Product save(Product product) {
        return genericRepository.save(product);
    }

    @Override
    public Boolean checkExpirationDate(Long id) {
        LocalDate expirationDate = genericRepository.findById(id).get().getExpirationDate();
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    public void setDiscountInPercentages(Long id, Double discount) {
        Product product = genericRepository.findById(id).get();
        product.setPrice(product.getPrice() / (discount / 100 + 1));
        genericRepository.save(product);
    }

    @Override
    public String getStatusById(Long id) {
        Product product = genericRepository.findById(id).get();
        return product.getStatus().toString();
    }
}