package com.jelopez.pricecomparatorbackend.affiliate;

import com.jelopez.pricecomparatorbackend.dto.ProductSearchResult;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service // Spring la detectará automáticamente
public class AliExpressAffiliateSearch implements AffiliateSearchService {

    @Override
    public List<ProductSearchResult> search(String productName) {
        // Aquí lógica para buscar en AliExpress (API, scraping, mock)
        return Collections.singletonList(
            new ProductSearchResult("AliExpress", "https://aliexpress.com/product-example", 29.99)
        );
    }
}
