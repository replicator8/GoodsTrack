package com.example.goodstrack.dtos;

import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.Supplier;
import lombok.Setter;
import lombok.Getter;
import java.util.Date;

@Getter
@Setter
public class SupplyDto {
    private Supplier supplier;
    private Store store;
    private Date dateSupply;
}
