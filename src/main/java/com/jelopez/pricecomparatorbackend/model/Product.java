package com.jelopez.pricecomparatorbackend.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usa la estrategia que prefieras
    private Long id;

    @Column(nullable = false, unique = true) // Por ejemplo, si no quieres nombres repetidos
    private String productName;

    // Relación con la entidad ProductListing
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductListing> listings = new ArrayList<>();

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ProductListing> getListings() {
        return listings;
    }

    public void setListings(List<ProductListing> listings) {
        this.listings = listings;
    }

    // Métodos auxiliares para manejar la lista
    public void addListing(ProductListing listing) {
        listings.add(listing);
        listing.setProduct(this);
    }

    public void removeListing(ProductListing listing) {
        listings.remove(listing);
        listing.setProduct(null);
    }
}
