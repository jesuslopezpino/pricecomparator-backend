package com.jelopez.pricecomparatorbackend.dto;

import java.util.List;

public class AliExpressResponse {
    private List<AliExpressProductDTO> products;

    public List<AliExpressProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<AliExpressProductDTO> products) {
        this.products = products;
    }

    public static class AliExpressProductDTO {
        private String name;
        private String url;
        private double price;
        private String currency;

        // Getters y Setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
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
        public String getCurrency() {
            return currency;
        }
        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }
}
