package com.jelopez.pricecomparatorbackend.dto;

import java.util.List;

public class ProductResponse {
    private List<ProductSearchResult> results;

    public ProductResponse(List<ProductSearchResult> results) {
        this.results = results;
    }

    public List<ProductSearchResult> getResults() {
        return results;
    }

    public void setResults(List<ProductSearchResult> results) {
        this.results = results;
    }
}
