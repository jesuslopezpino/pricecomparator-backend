package com.jelopez.pricecomparatorbackend.dto;

public class ProductSearchResult {
    private String source;
    private String url;
    private double price;

    public ProductSearchResult() {}

    public ProductSearchResult(String source, String url, double price) {
        this.source = source;
        this.url = url;
        this.price = price;
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
}
