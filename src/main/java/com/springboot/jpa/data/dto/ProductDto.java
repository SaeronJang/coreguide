package com.springboot.jpa.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
    private String name;
    private int price;
    private int stock;
}
