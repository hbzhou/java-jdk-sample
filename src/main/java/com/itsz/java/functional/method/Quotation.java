package com.itsz.java.functional.method;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class Quotation {

    private BigDecimal bid;
    private BigDecimal mid;
    private BigDecimal ask;

}
