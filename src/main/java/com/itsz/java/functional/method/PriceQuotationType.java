package com.itsz.java.functional.method;

import java.math.BigDecimal;

public enum PriceQuotationType {

    /**
     *
     */
    ASK {
        @Override
        public PriceQuotation apply(BigDecimal price, BigDecimal pricePercent) {
            return PriceQuotation.builder().ask(price).askPercent(pricePercent).build();
        }
    },

    /**
     *
     */
    BID {
        @Override
        public PriceQuotation apply(BigDecimal price, BigDecimal pricePercent) {
            return PriceQuotation.builder().bid(price).bidPercent(pricePercent).build();
        }
    },

    MID {
        @Override
        public PriceQuotation apply(BigDecimal price, BigDecimal pricePercent) {
            return PriceQuotation.builder().mid(price).midPercent(pricePercent).build();
        }
    };

    public abstract PriceQuotation apply(BigDecimal price, BigDecimal pricePercent);
}
