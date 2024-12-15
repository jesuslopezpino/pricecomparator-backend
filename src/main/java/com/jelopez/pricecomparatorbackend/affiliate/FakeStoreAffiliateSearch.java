package com.jelopez.pricecomparatorbackend.affiliate;

import com.jelopez.pricecomparatorbackend.dto.FakeStoreProductDTO;
import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FakeStoreAffiliateSearch implements AffiliateSearchService {

    private final RestTemplate restTemplate;
    private final String apiUrl = "https://fakestoreapi.com/products";

    public FakeStoreAffiliateSearch(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<ProductSearchResult> search(String productName) {
        FakeStoreProductDTO[] products = restTemplate.getForObject(apiUrl, FakeStoreProductDTO[].class);

        if (products == null || products.length == 0) {
            return List.of();
        }

        String lowerCaseName = productName.toLowerCase();

        return Arrays.stream(products)
                .filter(p -> p.getTitle().toLowerCase().contains(lowerCaseName))
                .map(p -> new ProductSearchResult(
                        "FakeStore",
                        p.getId(),
                        p.getTitle(),
                        p.getPrice(),
                        p.getDescription(),
                        p.getCategory(),
                        p.getImage(),
                        "USD",
                        Instant.now() // Usar Instant en vez de LocalDateTime
                ))
                .collect(Collectors.toList());
    }
}
