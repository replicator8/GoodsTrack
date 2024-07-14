package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
