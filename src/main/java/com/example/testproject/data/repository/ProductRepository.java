package com.example.testproject.data.repository;

import com.example.testproject.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// DB에 접근하는 메소드를 사용하기 위한 인터페이스
// CRUD를 정의하는 영역

// JpaRepository<레포지토리가 사용할 엔티티, Id(PK값)의 테이터 타입>
public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
