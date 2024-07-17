package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.StoreProducts;
import com.example.goodstrack.domain.Supplier;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.StoreRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.HashSet;
import java.util.Set;

@Repository
public class StoreRepositoryDaoImp extends GenericRepository<Store, Integer> implements StoreRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public StoreRepositoryDaoImp() {
        super(Store.class);
    }

    @Override
    @Transactional
    public Set<Store> findAllByName(String name) {
        return new HashSet<>(entityManager
                .createQuery("select s from Store s where s.name = :name", Store.class)
                .setParameter("name", name).getResultList());
    }

    @Override
    public Set<Product> getAllProducts() {
        return new HashSet<>(entityManager.createQuery(
                "select p.product from StoreProducts p join Store s on s.id = p.store.id", Product.class)
                .getResultList());
    }

    @Override
    public Set<Supplier> getAllSuppliers(int id) {
        return new HashSet<>(entityManager.createQuery(
                        "select p.supplier from SupplierStores p join Store s where p.store.id = :id", Supplier.class)
                .getResultList());
    }

    @Override
    @Transactional
    public Boolean goodsDisposal(Set<Product> products) {
        for (Product product : products) {
            int tempId = product.getId();
            try {
                entityManager.createQuery("select s from StoreProducts s where s.product.id = :tempId")
                        .setParameter("tempId", tempId)
                        .getSingleResult();
                entityManager.createQuery("delete from StoreProducts s where s.product.id = :tempId")
                                .setParameter("tempId", tempId)
                                .executeUpdate();
                entityManager.createQuery("delete from Product p where p.id = :tempId")
                        .setParameter("tempId", tempId)
                        .executeUpdate();
            } catch (NoResultException e) {
                return false;
            }
        }
        return true;
    }

    @Transactional
    public Boolean addProductToStore(Product product, Store store) {
        StoreProducts storeProduct = new StoreProducts(store, product);
        entityManager.persist(storeProduct);
        return true;
    }
}
