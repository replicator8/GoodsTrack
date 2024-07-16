package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Supplier;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.SupplierRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SupplierRepositoryDaoImp implements SupplierRepository {

    private final GenericRepository<Supplier, Integer> genericRepository;

    public SupplierRepositoryDaoImp(GenericRepository<Supplier, Integer> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Optional<Supplier> findById(int id) {
        return genericRepository.findById(id);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return genericRepository.save(supplier);
    }
}
