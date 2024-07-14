package com.example.goodstrack.services;

import com.example.goodstrack.domain.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class ServiceManager {

    @PersistenceContext
    private EntityManager entitymanager;

    @Transactional
    public void initializeData() {
//        Product product = new Product("Вафли", 50.7, "for sale", LocalDate.of(2024, 5, 14));
//        entitymanager.persist(product);
    }
}
