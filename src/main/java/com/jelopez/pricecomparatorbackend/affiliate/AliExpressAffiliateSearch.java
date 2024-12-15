package com.jelopez.pricecomparatorbackend.affiliate;

import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import com.jelopez.pricecomparatorbackend.dto.AliExpressResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

// @Service
public class AliExpressAffiliateSearch implements AffiliateSearchService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String apiUrl;

    public AliExpressAffiliateSearch(RestTemplate restTemplate,
                                     @Value("${affiliates.aliexpress.apiKey}") String apiKey,
                                     @Value("${affiliates.aliexpress.apiUrl}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
        this.apiUrl = apiUrl; // Por ejemplo: https://api.aliexpress.com/products
    }

    @Override
    public List<ProductSearchResult> search(String productName) {
        String url = String.format("%s?search=%s&apiKey=%s", apiUrl, productName, apiKey);

        // Llamar a la API de AliExpress
        AliExpressResponse response = restTemplate.getForObject(url, AliExpressResponse.class);

        if (response == null || response.getProducts() == null) {
            return List.of(); // Sin resultados o error
        }

        // Convertir la respuesta en una lista de ProductSearchResult
//        return response.getProducts().stream()
//                .map(p -> new ProductSearchResult("AliExpress", p.getUrl(), p.getPrice(), p.getCurrency()))
//                .collect(Collectors.toList());
        return null;
    }
}
