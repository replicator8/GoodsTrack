package com.example.goodstrack.dtos;

import com.example.goodstrack.domain.enums.ProductStatus;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class ProductDto {
    private String name;
    private Double price;
    private LocalDate expirationDate;
    private ProductStatus status;
}
