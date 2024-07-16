package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Supply;
import java.util.Optional;

public interface SupplyRepository {
    Optional<Supply> findById(int id);
}
