package com.example.goodstrack.repositories.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.repositories.GenericRepository;
import com.example.goodstrack.repositories.ProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class ProductRepositoryDaoImpl extends GenericRepository<Product, Integer> implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;
    private final ModelMapper modelMapper = new ModelMapper();

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
    @Transactional
    public Boolean checkAndDisposeGoods(Set<Product> products) {
        for (Product p: products) {
            LocalDate expirationDate = entityManager.find(Product.class, p.getId()).getExpirationDate();
            if (LocalDate.now().isAfter(expirationDate)) {
                Set<Product> prs = new HashSet<>();
                prs.add(p);
                entityManager.createQuery("delete from StoreProducts s where s.product.id = :tempId")
                        .setParameter("tempId", p.getId())
                        .executeUpdate();
                entityManager.createQuery("delete from Product p where p.id = :tempId")
                        .setParameter("tempId", p.getId())
                        .executeUpdate();
            }
        }
        return true;
    }

    public Boolean checkExpiration(Set<ProductDto> productsDto) {
        Set<Product> products = productsDto.stream()
                .map(dto -> modelMapper.map(dto, Product.class))
                .collect(Collectors.toSet());
        for (Product p: products) {
            LocalDate expirationDate = entityManager.find(Product.class, p.getId()).getExpirationDate();
            if (LocalDate.now().isAfter(expirationDate)) {
                return false;
            }
        }
        return true;
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

