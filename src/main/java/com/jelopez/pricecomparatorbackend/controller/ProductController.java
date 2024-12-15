package com.jelopez.priceComparatorBackend.controller;

import com.jelopez.pricecomparatorbackend.dto.ProductRequest;
import com.jelopez.pricecomparatorbackend.dto.ProductResponse;
import com.jelopez.pricecomparatorbackend.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/compare")
    public ProductResponse comparePrices(@RequestBody ProductRequest productRequest) {
        return productService.comparePrices(productRequest);
    }
}
