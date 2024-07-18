package com.example.goodstrack.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public abstract class GenericRepository<Entity, T> {

    private final Class<Entity> entityClass;

    public GenericRepository(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    protected EntityManager entityManager;

    public void create(Entity entity) {
        entityManager.persist(entity);
    }

    public Entity findById(Class<Entity> entityClass, Integer id) {
        return entityManager.find(entityClass, id);
    }

    public Entity update(Entity entity) {
        return entityManager.merge(entity);
    }
}
