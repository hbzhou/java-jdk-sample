package com.itsz.java.functional.method;

import java.math.BigDecimal;

public class PriceQuotationContext {

    private BigDecimal price;
    private BigDecimal pricePercent;
    private PriceQuotationType priceQuotationType;


    public PriceQuotation getQuotation() {
        return priceQuotationType.apply(price, pricePercent);
    }


}
