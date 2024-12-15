package com.jelopez.pricecomparatorbackend.repository;

import com.jelopez.pricecomparatorbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Busca un producto por su nombre, devolviendo un Optional
    Optional<Product> findByProductName(String productName);
}
