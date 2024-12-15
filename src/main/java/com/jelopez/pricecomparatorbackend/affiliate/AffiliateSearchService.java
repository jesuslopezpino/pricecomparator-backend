package com.jelopez.pricecomparatorbackend.affiliate;

import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import java.util.List;

public interface AffiliateSearchService {
    List<ProductSearchResult> search(String productName);
}
