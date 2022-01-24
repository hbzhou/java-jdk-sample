package com.itsz.java.escape.analysis;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EscapeAnalysis {

    public static void main(String[] args) {
        List<BigInteger> factorialList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Factorial factorial = new Factorial(i);
            factorialList.add(factorial.getFactorial());
        }

    }
}
