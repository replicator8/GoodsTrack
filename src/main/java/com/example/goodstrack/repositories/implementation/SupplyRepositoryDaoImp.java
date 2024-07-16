package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Supply;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.SupplyRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SupplyRepositoryDaoImp implements SupplyRepository {

    private final GenericRepository<Supply, Integer> genericRepository;

    public SupplyRepositoryDaoImp(GenericRepository<Supply, Integer> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Optional<Supply> findById(int id) {
        return genericRepository.findById(id);
    }
}
