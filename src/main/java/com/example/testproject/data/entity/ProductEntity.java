package com.example.testproject.data.entity;

import com.example.testproject.data.dto.ProductDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 엔티티임을 지정
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") // 테이블 명 지정 # Dto와 차이점

// Entity = Domain = Table
public class ProductEntity {
    // 필드는 각 테이블 컬럼을 의미
    @Id
    String productId; // Primary Key
    String productName;
    Integer productPrice;
    Integer productStock;

    public ProductDto toDto(){
        return ProductDto.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}
