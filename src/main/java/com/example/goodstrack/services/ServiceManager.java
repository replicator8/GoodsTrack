package com.example.goodstrack.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ServiceManager {

    @PersistenceContext
    private EntityManager entitymanager;

    @Transactional
    public void initializeData() {

    }
}
