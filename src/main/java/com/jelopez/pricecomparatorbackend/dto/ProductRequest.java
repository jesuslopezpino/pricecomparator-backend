package com.jelopez.pricecomparatorbackend.dto;

public class ProductRequest {
    private String productName;
    private String currentUrl;

    // Constructor vacío para deserialización
    public ProductRequest() {}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }
}
