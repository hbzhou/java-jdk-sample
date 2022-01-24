package com.itsz.java.functional.method;

import lombok.Builder;

import java.math.BigDecimal;


@Builder
public class PriceQuotation {

    private BigDecimal bid;
    private BigDecimal bidPercent;
    private BigDecimal mid;
    private BigDecimal midPercent;
    private BigDecimal ask;
    private BigDecimal askPercent;

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getBidPercent() {
        return bidPercent;
    }

    public void setBidPercent(BigDecimal bidPercent) {
        this.bidPercent = bidPercent;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    public BigDecimal getMidPercent() {
        return midPercent;
    }

    public void setMidPercent(BigDecimal midPercent) {
        this.midPercent = midPercent;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public BigDecimal getAskPercent() {
        return askPercent;
    }

    public void setAskPercent(BigDecimal askPercent) {
        this.askPercent = askPercent;
    }
}
