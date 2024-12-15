package com.jelopez.pricecomparatorbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_listings")
public class ProductListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source;
    private String url;
    private double price;

    // Por ejemplo, para la moneda usaremos un código ISO 4217 (ej: "USD", "EUR", "GBP")
    @Column(length = 3, nullable = false)
    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductListing() {
    }

    public ProductListing(String source, String url, double price, String currency) {
        this.source = source;
        this.url = url;
        this.price = price;
        this.currency = currency;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
