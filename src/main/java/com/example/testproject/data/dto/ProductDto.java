package com.example.testproject.data.dto;

import com.example.testproject.data.entity.ProductEntity;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

// 계층간 데이터 교환, 전달
public class ProductDto {
    //@Size(min = 8, max = 8) # 글자 수 유효성
    @NotNull
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    @Min(value = 500)
    @Max(value = 3000000)
    private int productPrice;

    @NotNull
    @Min(value = 0)
    @Max(value = 9999)
    private int productStock;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
            .productId(productId)
            .productName(productName)
            .productPrice(productPrice)
            .productStock(productStock)
            .build();
    }

}

