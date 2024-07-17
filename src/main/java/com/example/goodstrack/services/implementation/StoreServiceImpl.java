package com.example.goodstrack.services.implementation;

import com.example.goodstrack.domain.Product;
import com.example.goodstrack.dtos.ProductDto;
import com.example.goodstrack.repositories.implementation.StoreRepositoryDaoImp;
import com.example.goodstrack.services.StoreService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepositoryDaoImp storeRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    @Transactional
    public Boolean disposeGoods(Set<ProductDto> productsDto) {
        Set<Product> pr = productsDto.stream()
                .map(dto -> modelMapper.map(dto, Product.class))
                .collect(Collectors.toSet());
        return storeRepository.goodsDisposal(pr);
    }

}
