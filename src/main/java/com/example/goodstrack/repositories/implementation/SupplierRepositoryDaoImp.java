package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Supplier;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.SupplierRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class SupplierRepositoryDaoImp extends GenericRepository<Supplier, Integer> implements SupplierRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SupplierRepositoryDaoImp() {
        super(Supplier.class);
    }

}
