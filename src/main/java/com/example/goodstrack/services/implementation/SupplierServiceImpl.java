package com.example.goodstrack.services.implementation;

import com.example.goodstrack.repositories.implementation.SupplierRepositoryDaoImp;
import com.example.goodstrack.services.SupplierService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepositoryDaoImp supplierRepository;
    private final ModelMapper modelMapper = new ModelMapper();


}
