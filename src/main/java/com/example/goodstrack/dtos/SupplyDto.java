package com.example.goodstrack.dtos;

import com.example.goodstrack.domain.Store;
import com.example.goodstrack.domain.Supplier;
import lombok.Setter;
import lombok.Getter;
import java.util.Date;

@Getter
@Setter
public class SupplyDto {
    public int id;
    public Supplier supplier;
    public Store store;
    public Date dateSupply;
}
