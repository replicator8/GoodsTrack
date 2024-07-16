package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.ProductRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public class ProductRepositoryDaoImpl implements ProductRepository {

    private final GenericRepository<Product, Integer> genericRepository;

    public ProductRepositoryDaoImpl(GenericRepository<Product, Integer> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Optional<Product> findById(int id) {
        return genericRepository.findById(id);
    }

    @Override
    public Set<Product> findAllByName(String name) {
        return genericRepository.findAllByName(name);
    }

    @Override
    public Product save(Product product) {
        return genericRepository.save(product);
    }

    @Override
    public Boolean checkExpirationDate(int id) {
        LocalDate expirationDate = genericRepository.findById(id).get().getExpirationDate();
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    public void setDiscountInPercentages(int id, Double discount) {
        Product product = genericRepository.findById(id).get();
        product.setPrice(product.getPrice() / (discount / 100 + 1));
        genericRepository.save(product);
    }

    @Override
    public String getStatusById(int id) {
        Product product = genericRepository.findById(id).get();
        return product.getStatus().toString();
    }
}