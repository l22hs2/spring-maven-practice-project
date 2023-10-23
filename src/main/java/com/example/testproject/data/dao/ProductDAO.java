package com.example.testproject.data.dao;

import com.example.testproject.data.entity.ProductEntity;

// DB에 접근하는 객체
// 데이터 조회, 조작하는 기능을 전담
public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);
}
