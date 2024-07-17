package com.example.goodstrack.dtos;

import com.example.goodstrack.domain.enums.ProductStatus;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class ProductDto {
    public int id;
    public String name;
    public Double price;
    public LocalDate expirationDate;
    public ProductStatus status;
}
