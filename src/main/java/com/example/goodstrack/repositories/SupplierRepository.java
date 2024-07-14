package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
