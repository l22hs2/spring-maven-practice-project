package com.example.testproject.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") // 테이블 명 지정

// Entity = Domain = Table
public class ProductEntity {
    // 필드는 각 테이블 컬럼을 의미
    @Id
    String productID; // Primary Key
    String productName;
    Integer productPrice;
    Integer productStock;


}
