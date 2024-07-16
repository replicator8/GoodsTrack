package com.example.goodstrack.repositories;

import com.example.goodstrack.domain.Store;

public interface StoreRepository {
    Store findByName(String name);
    Store findById(int id);

}
