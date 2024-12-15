package com.jelopez.pricecomparatorbackend.service;

import com.jelopez.pricecomparatorbackend.affiliate.AffiliateSearchService;
import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import com.jelopez.pricecomparatorbackend.dto.ProductRequest;
import com.jelopez.pricecomparatorbackend.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<AffiliateSearchService> affiliateSearchServices;

    // Spring inyectará automáticamente todas las implementaciones
    // de AffiliateSearchService registradas como beans.
    public ProductService(List<AffiliateSearchService> affiliateSearchServices) {
        this.affiliateSearchServices = affiliateSearchServices;
    }

    public ProductResponse comparePrices(ProductRequest productRequest) {
        String productName = productRequest.getProductName();

        // Primero, buscar si el producto existe en BD (ejemplo omitido)
        // Si no existe, buscamos en los afiliados

        List<ProductSearchResult> aggregateResults = new ArrayList<>();
        for (AffiliateSearchService service : affiliateSearchServices) {
            aggregateResults.addAll(service.search(productName));
        }

        // Aquí podrías guardar esos resultados en la BD y luego retornarlos
        return new ProductResponse(aggregateResults);
    }
}
