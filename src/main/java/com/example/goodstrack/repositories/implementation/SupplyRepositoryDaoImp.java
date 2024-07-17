package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.Supply;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.SupplyRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SupplyRepositoryDaoImp extends GenericRepository<Supply, Integer> implements SupplyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public SupplyRepositoryDaoImp() {
        super(Supply.class);
    }


}
