package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Supplier;
import java.util.Optional;

public interface SupplierRepository {
    Optional<Supplier> findById(Long id);
    Supplier save(Supplier supplier);
}
