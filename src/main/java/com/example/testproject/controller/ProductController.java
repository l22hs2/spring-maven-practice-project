package com.example.testproject.controller;

import com.example.testproject.data.dto.ProductDto;
import com.example.testproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

    private ProductService productService;

    @Autowired // new 생성 없이, 객체 연결
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @GetMapping(value = "/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId) {
        return productService.getProduct(productId);
    }

    // http://localhost:8080/api/v1/product-api/product
    @PostMapping(value = "/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {

        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.saveProduct(productId,productName,productPrice,productStock);
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @DeleteMapping(value = "/product/{productId}")
    public ProductDto deleteProduct(@PathVariable String productId) {
        return null;
    }

}