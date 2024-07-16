package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.Supplier;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.StoreRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class StoreRepositoryDaoImp implements StoreRepository {

    private final GenericRepository<Store, Integer> genericRepository;

    private StoreRepository storeRepository;

    public StoreRepositoryDaoImp(GenericRepository<Store, Integer> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Store findById(int id) {
        return genericRepository.findById(id).get();
    }

    @Override
    public Store findAllByName(String name) {
        return genericRepository.findAllByName(name).stream().findFirst().get();
    }

    @Override
    public Set<Product> getAllProducts(int id) {
        return storeRepository.getAllProducts(id);
    }

    @Override
    public Set<Supplier> getAllSuppliers(int id) {
        return storeRepository.getAllSuppliers(id);
    }
}
