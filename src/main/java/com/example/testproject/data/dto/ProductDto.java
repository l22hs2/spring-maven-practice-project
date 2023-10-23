package com.example.testproject.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

// 계층간 데이터 교환
public class ProductDto {
    private String productID;
    private String productName;
    private int productPrice;
    private int productStock;


}
