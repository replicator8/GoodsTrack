package com.example.goodstrack.dtos;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class AddProductsDto {
    public int id;
    Set<ProductDto> products;
}
