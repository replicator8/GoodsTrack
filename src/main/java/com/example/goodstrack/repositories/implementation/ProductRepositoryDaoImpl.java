package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.ProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Repository
public class ProductRepositoryDaoImpl extends GenericRepository<Product, Integer> implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ProductRepositoryDaoImpl() {
        super(Product.class);
    }

    @Override
    public Set<Product> findAllByName(String name) {
        return new HashSet<>(entityManager
                .createQuery("select p from Product p where p.name = :name", Product.class)
                .setParameter("name", name).getResultList());
    }

    @Override
    public Product update(Product product) {
        return super.update(product);
    }

    @Override
    public Boolean checkExpirationDate(int id) {
        LocalDate expirationDate = entityManager.find(Product.class, id).getExpirationDate();
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    @Transactional
    public void setDiscountInPercentages(int id, Double discount) {
        Product product = entityManager.find(Product.class, id);
        product.setPrice(product.getPrice() - ((product.getPrice() * discount) / 100));
        entityManager.persist(product);
    }

    @Override
    public String getStatusById(int id) {
        return entityManager.find(Product.class, id).getStatus().toString();
    }

    @Override
    public Set<Product> findAllById() {
        return new HashSet<>(entityManager.createQuery("select p from Product p order by p.id", Product.class)
                .getResultList());
    }

    @Override
    public Boolean addProduct(Product product) {
        int id = product.getId();
        entityManager.persist(product);
        return entityManager.find(Product.class, id) != null;
    }
}

