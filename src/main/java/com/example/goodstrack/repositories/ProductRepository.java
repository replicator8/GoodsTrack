package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
