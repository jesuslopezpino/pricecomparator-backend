package com.jelopez.pricecomparatorbackend.affiliate;

import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

// @Service
public class EbayAffiliateSearch implements AffiliateSearchService {

    @Override
    public List<ProductSearchResult> search(String productName) {
        // Lógica específica para eBay
//        return Collections.singletonList(
//            new ProductSearchResult("eBay", "https://ebay.com/product-example", 31.50, "USD")
//        );
        return null;
    }
}
