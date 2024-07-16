package com.example.goodstrack.repositories.implementation;


import com.example.goodstrack.domain.Supplier;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.SupplierRepository;
import java.util.Optional;

public class SupplierRepositoryDaoImp implements SupplierRepository {

    private final GenericRepository<Supplier, Long> genericRepository;

    public SupplierRepositoryDaoImp(GenericRepository<Supplier, Long> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Optional<Supplier> findById(Long id) {
        return genericRepository.findById(id);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return genericRepository.save(supplier);
    }
}
