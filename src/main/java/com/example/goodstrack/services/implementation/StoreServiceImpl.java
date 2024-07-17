package com.example.goodstrack.services.implementation;

import com.example.goodstrack.repositories.implementation.StoreRepositoryDaoImp;
import com.example.goodstrack.services.StoreService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepositoryDaoImp storeRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    
}
