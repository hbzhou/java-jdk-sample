package com.itsz.java.functional.method;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public enum PriceQuotationTypeCopy {

    ASK((price, pricePercent) -> PriceQuotation.builder().ask(price).askPercent(pricePercent).build(), Quotation::getAsk),
    BID((price, pricePercent) -> PriceQuotation.builder().mid(price).askPercent(pricePercent).build(), Quotation::getBid),
    MID((price, pricePercent) -> PriceQuotation.builder().bid(price).askPercent(pricePercent).build(), Quotation::getMid);


    private final BiFunction<BigDecimal, BigDecimal, PriceQuotation> priceQuotationCreator;
    private final Function<Quotation, BigDecimal> priceQuotationGetter;


    PriceQuotationTypeCopy(BiFunction<BigDecimal, BigDecimal, PriceQuotation> priceQuotationCreator, Function<Quotation, BigDecimal> priceQuotationGetter) {
        this.priceQuotationCreator = priceQuotationCreator;
        this.priceQuotationGetter = priceQuotationGetter;
    }

}
