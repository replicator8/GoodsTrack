package com.example.goodstrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public abstract class GenericRepository<T, ID> implements JpaRepository<T, ID> {

    public abstract Optional<T> findByID(ID id);

    @Override
    public abstract <S extends T> S save(S entity);

    @Override
    public abstract void deleteById(ID id);

    public abstract Set<T> findAllByName(String name);
}
