package com.itsz.java.lambda;

import lombok.Data;

@Data
public class Orange implements Fruit {

    private int weight;

    public Orange(int weight) {
        this.weight = weight;
    }
}
