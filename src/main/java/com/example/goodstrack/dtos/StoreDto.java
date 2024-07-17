package com.example.goodstrack.dtos;

import com.example.goodstrack.domain.Supply;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class StoreDto {
    public int id;
    public String name;
    public String address;
    public Set<Supply> supplies;
}
