package com.example.goodstrack.services.implementation;

import com.example.goodstrack.repositories.implementation.SupplyRepositoryDaoImp;
import com.example.goodstrack.services.SupplyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplyServiceImpl implements SupplyService {
    @Autowired
    private SupplyRepositoryDaoImp supplyRepository;
    private final ModelMapper modelMapper = new ModelMapper();


}
