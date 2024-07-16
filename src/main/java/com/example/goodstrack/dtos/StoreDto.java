package com.example.goodstrack.dtos;

import com.example.goodstrack.domain.Supply;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class StoreDto {
    private String name;
    private String address;
    private Set<Supply> supplies;
}
