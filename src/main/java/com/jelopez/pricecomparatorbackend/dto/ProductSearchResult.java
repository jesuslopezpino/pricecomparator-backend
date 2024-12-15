package com.jelopez.pricecomparatorbackend.dto;

import java.time.Instant;

public class ProductSearchResult {
    private String source;
    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private String currency;
    private Instant viewedAt; // Usar Instant

    public ProductSearchResult() {}

    public ProductSearchResult(
            String source,
            Long id,
            String title,
            double price,
            String description,
            String category,
            String image,
            String currency,
            Instant viewedAt // Ahora este parámetro es un Instant
    ) {
        this.source = source;
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.currency = currency;
        this.viewedAt = viewedAt;
    }

    // Getters y Setters
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Instant getViewedAt() {
        return viewedAt;
    }

    public void setViewedAt(Instant viewedAt) {
        this.viewedAt = viewedAt;
    }
}
