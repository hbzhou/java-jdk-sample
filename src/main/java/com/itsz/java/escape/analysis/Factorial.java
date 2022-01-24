package com.itsz.java.escape.analysis;

import java.math.BigInteger;

public class Factorial {

    private int n;

    private BigInteger factorial;

    public Factorial(int n) {
        this.n = n;
    }

    public synchronized BigInteger getFactorial() {
        if (factorial == null)
            factorial = BigInteger.valueOf(n);
        return factorial;
    }
}
