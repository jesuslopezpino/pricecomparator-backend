package com.jelopez.pricecomparatorbackend.affiliate;

import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

// @Service
public class AmazonAffiliateSearch implements AffiliateSearchService {

    @Override
    public List<ProductSearchResult> search(String productName) {
        // Lógica específica para Amazon
//        return Collections.singletonList(
//            new ProductSearchResult("Amazon", "https://amazon.com/product-example", 33.25, "USD")
//        );
        return null;
    }
}
